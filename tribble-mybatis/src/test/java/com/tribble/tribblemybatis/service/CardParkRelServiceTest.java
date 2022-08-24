package com.tribble.tribblemybatis.service;

import com.tribble.tribblemybatis.entity.po.CouponsBo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lifan
 * @since 2022/8/9 7:29 PM
 */
@SpringBootTest
@Slf4j
public class CardParkRelServiceTest {
    @Autowired
    CardParkRelService cardParkRelService;

    @Test
    void saveCardParkRelFromCouponsBoTest1() {
        CouponsBo couponsBo = new CouponsBo();
        //couponsBo.setCardId("1123127515926233088");
        //couponsBo.setCardCode("20190430153041165812");
        couponsBo.setRccCarParkInfo("[{\"car_park_id\":\"1001574\",\"car_park_name\":\"无人值守研发停车场\"}]");
        int rows = cardParkRelService.saveCardParkRelFromCouponsBo(couponsBo);
        System.out.println(rows);
    }

    @Test
    void saveCardParkRelFromCouponsBoTest2() {
        CouponsBo couponsBo = new CouponsBo();
        couponsBo.setCardId("1123127515926233088");
        couponsBo.setCardCode("20190430153041165812");
        couponsBo.setRccCarParkInfo("[{\"car_park_id\":\"1001574\",\"car_park_name\":\"无人值守研发停车场\"}]");
        int rows = cardParkRelService.saveCardParkRelFromCouponsBo(couponsBo);
        System.out.println(rows);
    }

    @Test
    void saveCardParkRelFromCouponsBoTest3() {
        CouponsBo couponsBo = new CouponsBo();
        couponsBo.setCardId("1171008991841484800");
        couponsBo.setCardCode("20190909183434824940");
        couponsBo.setRccCarParkInfo("[{\"car_park_id\":\"989340\",\"car_park_name\":\"无人值守6号6停车场\"},{\"car_park_id\":\"1001574\",\"car_park_name\":\"无人值守研发车场\"}]");
        int rows = cardParkRelService.saveCardParkRelFromCouponsBo(couponsBo);
        System.out.println(rows);
    }

}
