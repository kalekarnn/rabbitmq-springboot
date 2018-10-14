package com.narendra.springboot.rabbitmq.config;

import org.springframework.amqp.core.*;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfiguration {

    @Bean
    Queue nodeQueqe() {
        return new Queue("node", false);
    }

    @Bean
    Queue javaQueqe() {
        return new Queue("java", false);
    }

    @Bean
    Queue englishQueqe() {
        return new Queue("english", false);
    }

    @Bean
    FanoutExchange programmingLanguageExchange() {
        return new FanoutExchange("programmingLanguage");
    }

    @Bean
    FanoutExchange generalLanguageExchange() {
        return new FanoutExchange("generalLanguage");
    }

    @Bean
    Binding ndoebinding(@Qualifier("nodeQueqe") Queue queue, @Qualifier("programmingLanguageExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    Binding javabinding(@Qualifier("javaQueqe") Queue queue, @Qualifier("programmingLanguageExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    Binding englishbinding(@Qualifier("englishQueqe") Queue queue, @Qualifier("generalLanguageExchange") FanoutExchange exchange) {
        return BindingBuilder.bind(queue).to(exchange);
    }

    @Bean
    public AmqpTemplate rabbitTemplate(ConnectionFactory connectionFactory) {
        return new RabbitTemplate(connectionFactory);
    }
}
