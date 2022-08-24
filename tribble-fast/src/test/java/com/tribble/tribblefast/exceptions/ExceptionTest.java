package com.tribble.tribblefast.exceptions;

import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableSet;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

/**
 * @author lifan
 * @since 2022/8/1 11:24 AM
 */
@Slf4j
public class ExceptionTest {
    @Test
    void test1() {
        try {
            fun1();
        } catch (Exception e) {
            log.error("{}", e.toString());
            log.info("========================== 分割线 ========================== ");
            log.error("{}",e.getMessage());
            log.info("========================== 分割线 ========================== ");
            log.error("{}", Throwables.getStackTraceAsString(e));
            //ImmutableSet
            //Throwables
        }
    }


    void fun1() {
        throw new NullPointerException("lilili");
        //Object
    }
}
