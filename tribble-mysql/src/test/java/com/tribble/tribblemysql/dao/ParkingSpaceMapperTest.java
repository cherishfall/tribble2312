package com.tribble.tribblemysql.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.test.autoconfigure.MybatisPlusTest;
import com.tribble.tribblemysql.po.ParkingSpace;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ParkingSpaceMapperTest {

    @Autowired
    ParkingSpaceMapper parkingSpaceMapper;

    @Test
    public void getParkingSpaceListByCarParkIdTest() {
        String carParkId = "14";
        QueryWrapper parkWrapper = new QueryWrapper();
        parkWrapper.eq("car_park_id", carParkId);
        parkWrapper.eq("is_delete", 0);
        List<ParkingSpace> parkingSpaceList =  parkingSpaceMapper.selectList(parkWrapper);
        log.info("{}", parkingSpaceList);
    }

}