package com.tribble.tribblefast.other;

import com.tribble.tribblefast.entity.po.Man;
import com.tribble.tribblefast.entity.po.Person;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class LombokTest {
    @Test
    public void test1() {
        Person person = Person.builder()
                .name("lifan")
                .age(24).build();
        log.info(person.toString());
    }

    @Test
    public void test2() {
        Man man = Man.builder()
                .name("lifan")
                .age(24)
                .sex("男").build();
        log.info(man.toString());
    }


}
