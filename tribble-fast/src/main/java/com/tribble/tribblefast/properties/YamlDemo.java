package com.tribble.tribblefast.properties;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.List;

/**
 * @author lifan
 * @since 2022/7/20 2:24 PM
 */
@Configuration
@Data
@NoArgsConstructor
public class YamlDemo {

    @Value("${kafka.topics}")
    List<String> kafkaTopics;
}
