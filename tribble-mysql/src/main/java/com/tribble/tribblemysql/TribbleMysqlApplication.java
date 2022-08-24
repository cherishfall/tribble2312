package com.tribble.tribblemysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.tribble.tribblemysql.dao")
public class TribbleMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(TribbleMysqlApplication.class, args);
    }

}
