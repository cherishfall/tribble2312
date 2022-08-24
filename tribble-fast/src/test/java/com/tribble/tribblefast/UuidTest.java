package com.tribble.tribblefast;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lifan
 * @since 2022/8/19 2:20 PM
 */
@Slf4j
public class UuidTest {
    @Test
    public void test1() throws InterruptedException {
        String uuid1 = UUID.randomUUID().toString();
        log.info("uuid1: {}", uuid1);
        Thread.sleep(100);

        String uuid2 = UUID.randomUUID().toString();
        log.info("uuid2: {}", uuid2);
        Thread.sleep(100);

        String uuid3 = UUID.randomUUID().toString();
        log.info("uuid3: {}", uuid3);
        Thread.sleep(100);

        String uuid4 = UUID.randomUUID().toString();
        log.info("uuid4: {}", uuid4);
        Thread.sleep(100);

        String uuid5 = UUID.randomUUID().toString();
        log.info("uuid5: {}", uuid5);
        Thread.sleep(100);

        String uuid6 = UUID.randomUUID().toString();
        log.info("uuid6: {}", uuid6);
        Thread.sleep(100);

        String uuid7 = UUID.randomUUID().toString();
        log.info("uuid7: {}", uuid7);
        Thread.sleep(100);

        String uuid8 = UUID.randomUUID().toString();
        log.info("uuid8: {}", uuid8);
        Thread.sleep(100);

        String uuid9 = UUID.randomUUID().toString();
        log.info("uuid9: {}", uuid9);
        Thread.sleep(100);

        Stream.of(uuid1, uuid2, uuid3, uuid4, uuid5, uuid6, uuid7, uuid8, uuid9)
                .sorted(Comparator.comparing(str -> str))
                .forEach(str -> log.info(str));

    }
}
