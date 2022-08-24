package com.tribble.tribblefast.datetime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@SpringBootTest
@Slf4j
public class LocalDateTimeTest {
    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Test
    public void test1() {
        LocalDateTime time1 = LocalDate.now().atTime(LocalTime.MIN);
        log.info("time1: {}", DF.format(time1));
        LocalDateTime time2 = LocalDateTime.now().withHour(0).withMinute(3).withSecond(3);
        log.info("time2: {}", DF.format(time2));

        long diff = ChronoUnit.SECONDS.between(time1, time2);
        log.info("diff between {} and {} is {} seconds", DF.format(time1), DF.format(time2), diff);
    }
}
