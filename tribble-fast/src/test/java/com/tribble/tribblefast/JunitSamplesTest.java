package com.tribble.tribblefast;

import org.junit.*;

/**
 * @author lifan
 * @since 2022/7/21 11:39 PM
 */
public class JunitSamplesTest {

    @Before
    public void before(){
        System.out.println(".....this is before test......");
    }

    @After
    public void after(){
        System.out.println(".....this is after test......");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println(".....this is before class test......");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println(".....this is after class test......");
    }

    @Test
    public void testOne(){
        System.out.println("this is test one");
    }

    @Test
    public void testTwo(){
        System.out.println("this is test two");
    }
}



