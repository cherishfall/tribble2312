package com.tribble.tribblemybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan(basePackages = "com.tribble.tribblemybatis.dao")
public class TribbleMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(TribbleMybatisApplication.class, args);
    }

}
