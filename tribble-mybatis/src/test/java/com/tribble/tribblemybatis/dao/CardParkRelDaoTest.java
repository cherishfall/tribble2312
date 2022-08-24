package com.tribble.tribblemybatis.dao;

import com.alibaba.fastjson.JSON;
import com.tribble.tribblemybatis.entity.po.CardParkRelBo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lifan
 * @since 2022/8/9 5:59 PM
 */
@SpringBootTest
@Slf4j
class CardParkRelDaoTest {

    @Autowired
    CardParkRelDao cardParkRelDao;

    @Test
    void save() {
        CardParkRelBo cardParkRelBo = new CardParkRelBo("11", "11", "11");
        int rows = cardParkRelDao.save(cardParkRelBo);
        System.out.println(rows);
    }

    @Test
    void savaBatch1() {
        int rows = cardParkRelDao.savaBatch(Collections.emptyList());
        System.out.println(rows);
    }

    @Test
    void savaBatch2() {
        CardParkRelBo cardParkRelBo4 = new CardParkRelBo("44", "44", "44");
        int rows = cardParkRelDao.savaBatch(Arrays.asList(cardParkRelBo4));
        System.out.println(rows);
    }

    @Test
    void savaBatch3() {
        CardParkRelBo cardParkRelBo2 = new CardParkRelBo("22", "22", "22");
        CardParkRelBo cardParkRelBo3 = new CardParkRelBo("33", "33", "33");
        CardParkRelBo cardParkRelBo4 = new CardParkRelBo("44", "44", "44");
        int rows = cardParkRelDao.savaBatch(Arrays.asList(cardParkRelBo2, cardParkRelBo3, cardParkRelBo4));
        System.out.println(rows);
    }



    @Test
    void findByParkIds1() {
        List<CardParkRelBo> cardParkRelBoList = cardParkRelDao.findByParkIds(Collections.emptyList());
        log.info("{}", JSON.toJSONString(cardParkRelBoList));
    }

    /** */
    @Test
    void findByParkIds2() {
        List<CardParkRelBo> cardParkRelBoList = cardParkRelDao.findByParkIds(Arrays.asList("3"));
        log.info("{}", JSON.toJSONString(cardParkRelBoList));
    }

    /** */
    @Test
    void findByParkIds3() {
        List<CardParkRelBo> cardParkRelBoList = cardParkRelDao.findByParkIds(Arrays.asList("3", "5"));
        log.info("{}", JSON.toJSONString(cardParkRelBoList));
    }

    /** */
    @Test
    void findByParkIds4() {
        List<CardParkRelBo> cardParkRelBoList = cardParkRelDao.findByParkIds(Arrays.asList("3", "5", "44"));
        log.info("{}", JSON.toJSONString(cardParkRelBoList));
    }

    @Test
    void findCardIdsByParkIdsTest1() {
        List<String> cardIdList = cardParkRelDao.findCardIdsByParkIds(Collections.emptyList());
        log.info("{}", JSON.toJSONString(cardIdList));
    }

    @Test
    void findCardIdsByParkIdsTest2() {
        List<String> cardIdList = cardParkRelDao.findCardIdsByParkIds(Arrays.asList("100"));
        log.info("{}", JSON.toJSONString(cardIdList));
    }

    @Test
    void findCardIdsByParkIdsTest3() {
        List<String> cardIdList = cardParkRelDao.findCardIdsByParkIds(Arrays.asList("44"));
        log.info("{}", JSON.toJSONString(cardIdList));
    }

    @Test
    void findCardIdsByParkIdsTest4() {
        List<String> cardIdList = cardParkRelDao.findCardIdsByParkIds(Arrays.asList("100", "2", "3","44"));
        log.info("{}", JSON.toJSONString(cardIdList));
    }







}