package com.tribble.tribblefast.datetime;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author lifan
 * @since 2022/8/24 6:30 PM
 */
@Slf4j
public class DurationTest {

    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Duration.between行为
     * */
    @Test
    public void test1() {
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.of(12, 10, 30);
        LocalDateTime time0 = LocalDateTime.of(localDate, localTime.minusMinutes(35));
        LocalDateTime time1 = LocalDateTime.of(localDate, localTime);
        LocalDateTime time2 = LocalDateTime.of(localDate, localTime.plusMinutes(73));
        log.info("\ntime0:{}\ntime1:{}\ntime2:{}", DF.format(time0), DF.format(time1), DF.format(time2));
        Duration duration1_0 = Duration.between(time1, time0);
        Duration duration1_2 = Duration.between(time1, time2);
        log.info("time1-time0: {} - {} 为 {} hours, {} minutes , ", DF.format(time1), DF.format(time0), duration1_0.toHours(),duration1_0.toMinutes());
        log.info("time1-time2: {} - {} 为 {} hours, {} minutes ", DF.format(time1), DF.format(time2), duration1_2.toHours(), duration1_2.toMinutes());
        // time1-time0: 2022-08-24 12:10:30 - 2022-08-24 11:35:30 为 0 hours, -35 minutes
        // time1-time2: 2022-08-24 12:10:30 - 2022-08-24 13:23:30 为 1 hours, 73 minutes
    }
}
