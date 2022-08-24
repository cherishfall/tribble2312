package com.tribble.tribblefast.properties;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lifan
 * @since 2022/7/20 2:42 PM
 */
@SpringBootTest
@Slf4j
class YamlDemoTest {
    @Autowired
    YamlDemo yamlDemo;

    @Test
    void test1() {
        log.info("{}", yamlDemo.getKafkaTopics());
    }
}