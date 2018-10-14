package com.narendra.springboot.rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void produceMsg(String exchange, String msg){
        amqpTemplate.convertAndSend(exchange, exchange, msg);
        System.out.println("Send msg on "+exchange+" = " + msg);
    }
}
