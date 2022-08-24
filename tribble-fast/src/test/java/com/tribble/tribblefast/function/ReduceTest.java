package com.tribble.tribblefast.function;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

/**
 * @author lifan
 * @since 2022/7/20 7:14 PM
 */
@Slf4j
public class ReduceTest {

    @Test
    void test1() {
        System.out.println("1");
    }

    @Test
    void test2() {
        int sum = Stream.of(1,2,3,4,5,6,7).reduce(0, Integer::sum);
        log.info("{}", sum);
    }

    @Test
    void test3() {
        // 按行读取配置文件:
        Map<String, String> strMap= Stream.of("profile=native", "debug=true", "logging=warn", "interval=500")
                .map(str -> {
                    String[] kv = str.split("\\=", 2);
                    return Collections.singletonMap(kv[0], kv[1]);
                })
                .reduce(new HashMap<>(), (m, map) -> {
                    m.putAll(map);
                    return m;
                });

        // 打印结果:
        strMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
    }
}
