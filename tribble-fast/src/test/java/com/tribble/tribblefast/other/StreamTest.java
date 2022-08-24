package com.tribble.tribblefast.other;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@Slf4j
public class StreamTest {

    @Test
    public void test1(){
        List<String> nameList = Stream.of("lifan", "lijiaojiao", "lixixi").collect(Collectors.toList());
        nameList.add("li");
        nameList.add("fan");
        List<String> otherNameList = nameList.stream().filter("zhang"::equals).collect(Collectors.toList());
        log.info("otherNameList: {}", otherNameList);
        otherNameList.add("who are you?");
        log.info("otherNameList: {}", otherNameList);

    }
}
