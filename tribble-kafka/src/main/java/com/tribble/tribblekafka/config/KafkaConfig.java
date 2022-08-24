package com.tribble.tribblekafka.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.listener.KafkaListenerErrorHandler;

@Configuration
public class KafkaConfig {
    @Bean
    public KafkaListenerErrorHandler globalErrorHandler(){
        return (message, exception) -> new Object();
    }
}
