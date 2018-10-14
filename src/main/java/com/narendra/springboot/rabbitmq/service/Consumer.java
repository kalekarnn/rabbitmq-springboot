package com.narendra.springboot.rabbitmq.service;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @RabbitListener(queues="node")
    public void recievedNodeMessage(String msg) {
        System.out.println("Recieved Message on node queue : " + msg);
    }

    @RabbitListener(queues="java")
    public void recievedJavaMessage(String msg) {
        System.out.println("Recieved Message on java queue : " + msg);
    }

    @RabbitListener(queues="english")
    public void recievedenglishMessage(String msg) {
        System.out.println("Recieved Message on english queue : " + msg);
    }
}
