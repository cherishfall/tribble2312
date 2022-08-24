package com.tribble.tribblefast;

import com.tribble.tribblefast.service.ManService;
import com.tribble.tribblefast.service.WomanService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lifan
 * @since 2022/8/24 2:39 PM
 */
@SpringBootTest
@Slf4j
public class FastTest2 {
    @Autowired
    ManService manService;

    @Autowired
    WomanService womanService;

    @Test
    public void test1() {
        manService.fun0();
        log.info("============");
        womanService.fun0();
    }

}
