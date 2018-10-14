package com.narendra.springboot.rabbitmq.service;

import external.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishService {

    @Autowired
    Producer producer;

    public void publish(PublishRequest publishRequest){
       producer.produceMsg(publishRequest.getExchangeName(), publishRequest.getMessage());
    }
}
