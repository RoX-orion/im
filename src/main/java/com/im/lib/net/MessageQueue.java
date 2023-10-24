package com.im.lib.net;

/**
 * Copyright (c) 2018-2023 Andre Lina. All rights reserved.
 *
 * @author: Andre Lina
 * @date: 2023-07-08
 */

//@Component
public class MessageQueue {

//    private final KafkaTemplate<String, Object> kafkaTemplate;
//
//    private final ObjectMapper mapper;
//
//    public MessageQueue(
//            final KafkaTemplate kafkaTemplate,
//            final ObjectMapper mapper) {
//        this.kafkaTemplate = kafkaTemplate;
//        this.mapper = mapper;
//    }
//
//    public void sendRequestToKafka(RequestData requestData) {
//        try {
//            kafkaTemplate.send(Constant.WS_REQUEST_TOPIC, mapper.writeValueAsBytes(requestData));
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void sendRequestToKafka(List<RequestData> requestDataList) {
//
//    }
//
//    public void sendResponseToKafka(RpcResult rpcResult) {
//        try {
//            kafkaTemplate.send(Constant.WS_RESPONSE_TOPIC, mapper.writeValueAsBytes(rpcResult));
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
