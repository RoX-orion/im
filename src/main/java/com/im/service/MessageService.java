package com.im.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.im.config.Constant;
import com.im.entity.MTProtoState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class MessageService {
    ObjectMapper objectMapper = new ObjectMapper();

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public long getServerTime() {
        return System.currentTimeMillis();
    }

    public BigInteger getNewMsgId(long uid) throws JsonProcessingException {
        String s = stringRedisTemplate.opsForValue().get(Constant.MTPROTO_STATE + uid);
        MTProtoState mtProtoState = objectMapper.readValue(s, MTProtoState.class);
        var now = System.currentTimeMillis() / 1000 + mtProtoState.getTimeOffset();
        var nanoseconds = Math.floor((now - Math.floor(now)) * 1e9);
        var newMsgId = (new BigInteger(String.valueOf(Math.floor(now)))
                .shiftLeft(32)).or(new BigInteger(String.valueOf(nanoseconds))
                .shiftLeft(2));
        BigInteger lastMsgId = mtProtoState.getLastMsgId();
        if (lastMsgId.compareTo(newMsgId) == 0
                || lastMsgId.compareTo(newMsgId) > 0) {
            newMsgId = lastMsgId.add(new BigInteger("4"));
        }
        mtProtoState.setLastMsgId(newMsgId);
        stringRedisTemplate.opsForValue().set(
                Constant.MTPROTO_STATE + uid,
                objectMapper.writeValueAsString(mtProtoState));
        return newMsgId;
    }

    public void reset() {
        // Session IDs can be random on every connection
//        this.id = Helpers.generateRandomLong(true);
//        this._sequence = 0;
//        this._lastMsgId = BigInt(0);
//        this.msgIds = [];
    }

    /**
     * 生成消息序列号
     */
    public long getSeqNo(boolean contentRelated, long uid) throws JsonProcessingException {
        String s = stringRedisTemplate.opsForValue().get(Constant.MTPROTO_STATE + uid);
        MTProtoState mtProtoState = objectMapper.readValue(s, MTProtoState.class);
        long sequence = mtProtoState.getSequence();
        if (contentRelated) {
            var result = sequence << 1 | 1;
            sequence += 1;
            mtProtoState.setSequence(sequence);
            stringRedisTemplate.opsForValue().set(
                    Constant.MTPROTO_STATE + uid,
                    objectMapper.writeValueAsString(mtProtoState));
            return result;
        } else {
            return sequence << 1;
        }
    }
}
