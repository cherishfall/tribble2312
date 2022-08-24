package com.tribble.tribblemybatis.dao;

import com.tribble.tribblemybatis.entity.vo.CardReleaseVo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author lifan
 * @since 2022/8/11 2:38 PM
 */
@SpringBootTest
@Slf4j
class CardReleaseDAOTest {

    @Autowired
    CardReleaseDAO cardReleaseDAO;

    @Test
    void getCountWithCardIdList1() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList());

        int rows = cardReleaseDAO.getCountWithCardIdList(aCardReleaseVo);
        log.info("{}", rows);
    }

    @Test
    void getCountWithCardIdList2() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList("1"));

        int rows = cardReleaseDAO.getCountWithCardIdList(aCardReleaseVo);
        log.info("{}", rows);
    }

    @Test
    void getCountWithCardIdList3() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList("1", "2"));

        int rows = cardReleaseDAO.getCountWithCardIdList(aCardReleaseVo);
        log.info("{}", rows);
    }

    @Test
    void queryCardListWithCardIdList1() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList());

        List<CardReleaseVo> cardReleaseVoList =  cardReleaseDAO.queryCardListWithCardIdList(aCardReleaseVo);
        log.info("{}", cardReleaseVoList);
    }

    @Test
    void queryCardListWithCardIdList2() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList("1"));

        List<CardReleaseVo> cardReleaseVoList =  cardReleaseDAO.queryCardListWithCardIdList(aCardReleaseVo);
        log.info("{}", cardReleaseVoList);
    }

    @Test
    void queryCardListWithCardIdList3() {
        CardReleaseVo aCardReleaseVo = new CardReleaseVo();
        aCardReleaseVo.setPage(1);
        aCardReleaseVo.setRows(10);
        aCardReleaseVo.setRcci_user_ids(Arrays.asList("1", "2"));
        aCardReleaseVo.setServer_type("100001");
        aCardReleaseVo.setRcci_state("0");
        aCardReleaseVo.setCard_id_list(Arrays.asList("1", "2"));

        List<CardReleaseVo> cardReleaseVoList =  cardReleaseDAO.queryCardListWithCardIdList(aCardReleaseVo);
        log.info("{}", cardReleaseVoList);
    }
}