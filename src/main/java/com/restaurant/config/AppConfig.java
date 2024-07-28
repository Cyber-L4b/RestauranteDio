package com.restaurant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.restaurant.order.OrderProcessor;

@Configuration
public class AppConfig {

    @Bean
    public OrderProcessor orderProcessor() {
        return OrderProcessor.getInstance();
    }


}