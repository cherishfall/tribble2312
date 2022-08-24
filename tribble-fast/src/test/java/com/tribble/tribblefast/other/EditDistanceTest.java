package com.tribble.tribblefast.other;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.text.similarity.LevenshteinDistance;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class EditDistanceTest {

    @Test
    public void test1() {
        String str1 = "闽D4362J";
        String str2 = "浙D4362J";
        int edit_distance = LevenshteinDistance.getDefaultInstance().apply(str1, str2);
        log.info("{} to {} edit_distance is {}", str1, str2, edit_distance);
    }
}
