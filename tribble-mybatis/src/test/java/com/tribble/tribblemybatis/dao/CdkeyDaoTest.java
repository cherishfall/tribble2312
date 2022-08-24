package com.tribble.tribblemybatis.dao;

import com.alibaba.fastjson.JSON;
import com.tribble.tribblemybatis.entity.po.CdkeyBo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lifan
 * @since 2022/8/10 7:47 PM
 */
@SpringBootTest
@Slf4j
class CdkeyDaoTest {

    @Autowired
    CdkeyDao cdkeyDao;

    @Test
    void countGiveReportTest1() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList();
        int count = cdkeyDao.countGiveReport(createUserIds, carParkIdList);
        log.info("{}", count);
    }

    @Test
    void countGiveReportTest2() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList("1");
        int count = cdkeyDao.countGiveReport(createUserIds, carParkIdList);
        log.info("{}", count);
    }

    @Test
    void countGiveReportTest3() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList("1", "2", "3");
        int count = cdkeyDao.countGiveReport(createUserIds, carParkIdList);
        log.info("{}", count);
    }

    @Test
    void queryGiveReportTest1() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList();
        List<CdkeyBo> cdkeyBoList = cdkeyDao.queryGiveReport(createUserIds, carParkIdList, 1, 10);
        log.info("{}", JSON.toJSONString(cdkeyBoList));
    }

    @Test
    void queryGiveReportTest2() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList("1");
        List<CdkeyBo> cdkeyBoList = cdkeyDao.queryGiveReport(createUserIds, carParkIdList, 1, 10);
        log.info("{}", JSON.toJSONString(cdkeyBoList));
    }

    @Test
    void queryGiveReportTest3() {
        List<String> createUserIds = Arrays.asList("1", "2", "3");
        List<String> carParkIdList = Arrays.asList("1", "2", "3");
        List<CdkeyBo> cdkeyBoList = cdkeyDao.queryGiveReport(createUserIds, carParkIdList, 1, 10);
        log.info("{}", JSON.toJSONString(cdkeyBoList));
    }



}