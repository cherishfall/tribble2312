package com.tribble.tribblefast;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author lifan
 * @since 2022/7/21 8:56 AM
 */
@Slf4j
public class StringTest {
    @Test
    void test1() {
        String str = "my name is lifan";
        String[] words = str.split("\\s");
        log.info(Arrays.toString(words));
    }

    @Test
    public void test2() {
        String plateNo = "闽CEU896";
        log.info(plateNo.substring(1));
    }

    /**
     * String.join 行为
     * */
    @Test
    void test3() {
        String str = null;

        List<String> list0 = new ArrayList<>();
        str = String.join(",", list0);
        log.info("{}", str);

        List<String> list1 = Stream.of("lifan").collect(Collectors.toList());
        str = String.join(",", list1);
        log.info("{}", str);

        List<String> list2 = Stream.of("lifan", "lijiaojiao").collect(Collectors.toList());
        str = String.join(",", list2);
        log.info("{}", str);
    }

    @Test
    void test4() {
        List<String> parkIdList = Arrays.asList("1", "2", "3", "4");
        // 构建车场id字符串
        StringBuilder parkIdsBuilder = new StringBuilder();
        for(int i = 0; i < parkIdList.size()-1; ++i) {
            parkIdsBuilder.append(parkIdList.get(i)).append(",");
        }
        String parkIds = parkIdsBuilder.append(parkIdList.get(parkIdList.size()-1)).toString();
        log.info(parkIds);
    }

}
