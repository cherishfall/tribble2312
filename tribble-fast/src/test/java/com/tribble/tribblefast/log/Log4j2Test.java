package com.tribble.tribblefast.log;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Level;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Log4j2
public class Log4j2Test {

    @Test
    void contextLoads() {
    }

    @Test
    public void test1() {
        log.error("error test123");
        log.warn("warn test123");
        log.log(Level.getLevel("BUSINESS"), "business test123");
        log.info("info test123");
        log.debug("debug test123");

        log.info("business: {}, {}", "haha", "xixi");
    }
}
