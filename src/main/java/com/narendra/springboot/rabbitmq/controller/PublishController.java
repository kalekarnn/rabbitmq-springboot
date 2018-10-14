package com.narendra.springboot.rabbitmq.controller;

import com.narendra.springboot.rabbitmq.service.PublishService;
import external.PublishRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publish")
public class PublishController {

    @Autowired
    PublishService publishService;

    @PostMapping
    public void publishOnExchange(@RequestBody PublishRequest publishRequest){
        publishService.publish(publishRequest);
    }
}
