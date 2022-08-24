package com.example.lisener.lisener;


import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Lisener {
    @RabbitListener(queues = "JavaTestQueue2")
    public void getLisener(Orderstatus orderstatus){
        System.out.println("messgae resiver from Lisener" + orderstatus);

    }
    @Bean
    public Jackson2JsonMessageConverter converter() {
        return new Jackson2JsonMessageConverter();
    }
}
