package com.im.lib.tl;

import com.im.lib.net.AbstractSerializedData;

import java.util.List;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-06-18
 */

public class MTProtoApi {

    private MTProtoApi() {}

    // resPQ#05162463 nonce:int128 server_nonce:int128
    // pq:string server_public_key_fingerprints:Vector<long> = ResPQ;
    public static class ResPQ extends TLObject {
        public static int constructor = 0x05162463;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] pq;
        public List<Long> server_public_key_fingerprints;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeByteArray(pq);

            stream.writeInt32(TLRPC.Vector.constructor);
            int count = server_public_key_fingerprints.size();
            stream.writeInt32(count);
            for (int i = 0; i < count; i++) {
                stream.writeInt64(server_public_key_fingerprints.get(i));
            }
        }
    }

    // p_q_inner_data#83c95aec pq:string p:string q:string nonce:int128
    // server_nonce:int128 new_nonce:int256 = P_Q_inner_data;
    public static class P_q_inner_data extends TLObject {
        public static int constructor = 0x83c95aec;

        public byte[] pq;
        public byte[] p;
        public byte[] q;
        public byte[] nonce = new byte[16];
        public byte[] server_nonce = new byte[16];
        public byte[] new_nonce = new byte[32];

        @Override
        public void readParams(AbstractSerializedData stream) {
            pq = stream.readByteArray();
            p = stream.readByteArray();
            q = stream.readByteArray();
            stream.readBytes(nonce);
            stream.readBytes(server_nonce);
            stream.readBytes(new_nonce);
        }
    }

    public static class Server_DH_inner_data extends TLObject {
        public static int constructor = 0xb5890dba;

        public byte[] nonce = new byte[16];
        public byte[] server_nonce = new byte[16];
        public int g;
        public byte[] dh_prime;
        public byte[] g_a;
        public int server_time;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeInt32(g);
            stream.writeByteArray(dh_prime);
            stream.writeByteArray(g_a);
            stream.writeInt32(server_time);
        }
    }

    // client_DH_inner_data#6643b654 nonce:int128 server_nonce:int128 retry_id:long g_b:string = Client_DH_Inner_Data;
    public static class Client_DH_inner_data extends TLObject {
        public static int constructor = 0x6643b654;

        public byte[] nonce = new byte[16];
        public byte[] server_nonce = new byte[16];
        public long retry_id;
        public byte[] g_b;

        @Override
        public void readParams(AbstractSerializedData stream) {
            stream.readBytes(nonce);
            stream.readBytes(server_nonce);
            retry_id = stream.readInt64();
            g_b = stream.readByteArray();
        }
    }

    public static abstract class Server_DH_params extends TLObject {
    }

    public static class Server_DH_params_fail extends Server_DH_params {
        public static int constructor = 0x79cb045d;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] new_nonce_hash;

        public Server_DH_params_fail(byte[] nonce, byte[] server_nonce, byte[] new_nonce_hash) {
            this.nonce = nonce;
            this.server_nonce = server_nonce;
            this.new_nonce_hash = new_nonce_hash;
        }

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeBytes(new_nonce_hash);
        }
    }

    public static class Server_DH_params_ok extends Server_DH_params {
        public static int constructor = 0xd0e8075c;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] encrypted_answer;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeByteArray(encrypted_answer);
        }
    }

    public static abstract class Set_client_DH_params_answer extends TLObject {}

    public static class DH_gen_ok extends Set_client_DH_params_answer {
        public static int constructor = 0x3bcbf734;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] new_nonce_hash1;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeBytes(new_nonce_hash1);
        }
    }

    public static class DH_gen_retry extends Set_client_DH_params_answer {
        public static int constructor = 0xa69dae02;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] new_nonce_hash2;
        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeBytes(new_nonce_hash2);
        }
    }

    public static class DH_gen_fail extends Set_client_DH_params_answer {
        public static int constructor = 0xa69dae02;

        public byte[] nonce;
        public byte[] server_nonce;
        public byte[] new_nonce_hash3;

        public DH_gen_fail(byte[] nonce, byte[] server_nonce, byte[] new_nonce_hash3) {
            this.nonce = nonce;
            this.server_nonce = server_nonce;
            this.new_nonce_hash3 = new_nonce_hash3;
        }

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeBytes(nonce);
            stream.writeBytes(server_nonce);
            stream.writeBytes(new_nonce_hash3);
        }
    }
    //
    public static class ReqPqMulti extends TLObject {
        public static int constructor = 0xbe7e8ef1;

        public byte[] nonce = new byte[16];

        @Override
        public void readParams(AbstractSerializedData stream) {
            stream.readBytes(nonce);
        }
    }

    public static class ReqPqMultiNew extends TLObject {
        public static int constructor = 0x51b410fd;

        public byte[] nonce;

        @Override
        public void readParams(AbstractSerializedData stream) {
            nonce = new byte[16];
            stream.readBytes(nonce);
        }
    }

    public static class ReqDHParams extends TLObject {
        public static int constructor = 0xd712e4be;

        public byte[] nonce = new byte[16];
        public byte[] server_nonce = new byte[16];
        public byte[] p;
        public byte[] q;
        public long public_key_fingerprint;
        public byte[] encrypted_data;

        @Override
        public void readParams(AbstractSerializedData stream) {
            stream.readBytes(nonce);
            stream.readBytes(server_nonce);
            p = stream.readByteArray();
            q = stream.readByteArray();
            public_key_fingerprint = stream.readInt64();
            encrypted_data = stream.readByteArray();
        }
    }

    public static class SetClientDHParams extends TLObject {
        public static int constructor = 0xf5045f1f;

        public byte[] nonce = new byte[16];
        public byte[] server_nonce = new byte[16];
        public byte[] encrypted_data;

        @Override
        public void readParams(AbstractSerializedData stream) {
            stream.readBytes(nonce);
            stream.readBytes(server_nonce);
            encrypted_data = stream.readByteArray();
        }
    }

    public static class Bad_msg_notification extends TLObject {
        public static int constructor = 0xa7eff811;

        public long bad_msg_id;
        public long bad_msg_seqno;
        public int error_code;


        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeInt64(bad_msg_id);
            stream.writeInt64(bad_msg_seqno);
            stream.writeInt32(error_code);
        }
    }

    public static class Bad_server_salt extends Bad_msg_notification {
        public static int constructor = 0xedab447b;

        public long new_server_salt;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            super.serializeToStream(stream);
            stream.writeInt64(new_server_salt);
        }
    }

    public static class Rpc_error extends TLObject {
        public static int constructor = 0x2144ca19;

        public int error_code;
        public String error_message;

        @Override
        public void serializeToStream(AbstractSerializedData stream) {
            stream.writeInt32(constructor);
            stream.writeInt32(error_code);
            stream.writeString(error_message);
        }
    }

    public static class Ping_delay_disconnect extends TLObject {
        public static int constructor = 0xf3427b8c;

        public long ping_id;
        public int disconnect_delay;

        @Override
        public void readParams(AbstractSerializedData stream) {
            ping_id = stream.readInt64();
            disconnect_delay = stream.readInt32();
        }
    }

    public static class Pong extends TLObject {
        public static int constructor = 0x347773c5;

        public long msg_id;
        public long ping_id;

        @Override
        public void readParams(AbstractSerializedData stream) {
            msg_id = stream.readInt64();
            ping_id = stream.readInt64();
        }
    }
}
