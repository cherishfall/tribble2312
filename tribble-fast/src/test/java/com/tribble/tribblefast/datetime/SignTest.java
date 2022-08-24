package com.tribble.tribblefast.datetime;

import cn.hutool.crypto.digest.DigestUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;
import java.time.*;
import java.time.format.DateTimeFormatter;

@SpringBootTest
@Slf4j
public class SignTest {
    private static final DateTimeFormatter DF = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Test
    public void test1() {
        log.info("{}", ZoneId.getAvailableZoneIds());

        ZoneId defaultZoneId = ZoneId.systemDefault();
        log.info(defaultZoneId.toString());
        ZoneId chinaZoneId1 = ZoneId.of("Asia/Shanghai");
        ZoneId chinaZoneId2 = ZoneId.of("+8");
        ZoneId chinaZoneId3 = ZoneId.of("+08:00");
        log.info("{}, {}, {}", chinaZoneId1, chinaZoneId2, chinaZoneId3);
    }

    @Test
    public void test2() {
        Instant instant = Instant.ofEpochSecond(1611540682L);
        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        log.info("localDateTime: {}", localDateTime.format(DF)); // localDateTime: 2021-01-25 10:11:22

        String timeStamp1 = String.valueOf(localDateTime.toEpochSecond(ZoneOffset.ofHours(8)));
        String timeStamp2 = String.valueOf(localDateTime.toEpochSecond(ZoneOffset.of("+8")));
        String timeStamp3 = String.valueOf(localDateTime.toEpochSecond(ZoneOffset.of("+08:00")));

        log.info("timeStamp: {}, {}, {}", timeStamp1, timeStamp2, timeStamp3); // timeStamp: 1611540682, 1611540682, 1611540682

    }

    @Test
    public void test3() {
        String sign = "DF925FBD871D15202AEDAE60AFF7426D";
        String signData = "RF_86_00000011611540682153A306B395F2730F31346EDD04EDD82";

        String detectorNo = "RF_86_0000001";
        String timeStamp = "1611540682";
        String detectorEncryptData = "153A306B395F2730F31346EDD04EDD82";
        String waitSignedData = detectorNo+timeStamp+detectorEncryptData;
        // waitSignData: RF_86_00000011611540682153A306B395F2730F31346EDD04EDD82, true
        log.info("waitSignData: {}, {}", waitSignedData, waitSignedData.equals(signData));

        String signedStr1 = DigestUtil.md5Hex(waitSignedData).toUpperCase();
        // md5Hex: 5952DF8F27014DA1463E2C3C1528F84B, result false
        log.info("md5Hex: {}, result {}", signedStr1, sign.equals(signedStr1));

        // md5Hex: 5952DF8F27014DA1463E2C3C1528F84B, result false
        String signedStr2 = DigestUtils.md5DigestAsHex(waitSignedData.getBytes(StandardCharsets.UTF_8)).toUpperCase();
        log.info("md5Hex: {}, result {}", signedStr2, sign.equals(signedStr2));
    }


}
