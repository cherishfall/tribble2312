package com.tribble.tribblefast.json;




import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.tribble.tribblefast.entity.po.MyPerson;
import com.tribble.tribblefast.entity.vo.CouponsCarParkLimitVo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest
@Slf4j
public class FastJsonTest {
    @Test
    public void test1() {

    }

    /**
     * fastjson 序列化时间日期，及null属性的反序列化行为
     * */
    @Test
    public void test2() {
        MyPerson myPerson1 = MyPerson.builder()
                .name("李凡")
                .age(24)
                .birthDateTime(LocalDateTime.now())
                .dateTimeFieldOne(LocalDateTime.now())
                .dead(false).build();
        log.info("{}", JSON.toJSONString(myPerson1));
        // {"age":24,"birthDateTime":"2022-08-15 13:18:43","date_time_field_one":"2022-08-15T13:18:43.351","dead":false,"name":"李凡"}

        MyPerson myPerson2 = MyPerson.builder()
                .name("李凡")
                //.age(24)
                .birthDateTime(LocalDateTime.now())
                .dateTimeFieldOne(LocalDateTime.now())
                //.dead(false)
                .build();
        log.info("{}", JSON.toJSONStringWithDateFormat(myPerson2, "yyyy-MM-dd HH:mm:ss"));
        // {"birthDateTime":"2022-08-15 13:18:43","date_time_field_one":"2022-08-15 13:18:43","name":"李凡"}
    }

    /**
     * jsonObject和javaBean反序列化的行为，时间日期, null, 等行为
     * */
    @Test
    public void test3() {
        String jsonStr1 = "{\"age\":24,\"birthDateTime\":\"2022-07-12 11:17:55\",\"date_time_field_one\":\"2022-08-15T13:18:43.351\",\"name\":\"李凡\"}";
        JSONObject jsonObject1 = JSON.parseObject(jsonStr1);
        MyPerson myPerson1 = JSON.parseObject(jsonStr1, MyPerson.class);

        String jsonStr2 = "{\"age\":24,\"birthDateTime\":\"2022-07-12 11:21:32\",\"dead\":false,\"name\":null}";
        JSONObject jsonObject2 = JSON.parseObject(jsonStr2);
        // 这里不是null字符串，而是null，这个行为就是对的
        String name = jsonObject2.getString("name");
        MyPerson myPerson2 = JSON.parseObject(jsonStr2, MyPerson.class);

        log.info("{}, {}, {}", myPerson1, myPerson2, name);

    }

    @Test
    public void test4() {
        String jsonStr1 = "{\"age\":24,\"birthDateTime\":\"2022-07-12 11:17:55\",\"name\":\"李凡\"}";
        JSONObject jsonObject = JSON.parseObject(jsonStr1);
        String name = (String) jsonObject.get("name");
        name = "李姣姣";
        jsonObject.put("dead", false);
        MyPerson myPerson = jsonObject.toJavaObject(MyPerson.class);
        log.info("{}", JSON.toJSONString(myPerson));
    }

    /**
     * 反序列化为列表
     * */
    @Test
    public void test5() {
        //String jsonStr0 = "12345";
        //List<CouponsCarParkLimitVo> couponsCarParkLimitVos0 = JSONArray.parseArray(jsonStr0, CouponsCarParkLimitVo.class);
        //System.out.println(couponsCarParkLimitVos0.toString());
        /* 反序列化抛异常*/

        String jsonStr1 = "[]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVos1 = JSONArray.parseArray(jsonStr1, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVos1.toString());


        String jsonStr2 = "[{\"car_park_id\":\"342967\",\"car_park_name\":\"西溪花园5号测试\"}]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVos2 = JSONArray.parseArray(jsonStr2, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVos2.toString());

        String jsonStr3 = "[{\"car_park_id\":\"989340\",\"car_park_name\":\"无人值守6号6停车场\"},{\"car_park_id\":\"1001574\",\"car_park_name\":\"无人值守研发车场\"}]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVo3 = JSONArray.parseArray(jsonStr3, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVo3.toString());



    }

    /**
     * 反序列化为列表, 使用json
     * */
    @Test
    public void test6() {
        //String jsonStr0 = "12345";
        //List<CouponsCarParkLimitVo> couponsCarParkLimitVos0 = JSONArray.parseArray(jsonStr0, CouponsCarParkLimitVo.class);
        //System.out.println(couponsCarParkLimitVos0.toString());
        /* 反序列化抛异常*/

        String jsonStr1 = "[]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVos1 = JSON.parseArray(jsonStr1, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVos1.toString());


        String jsonStr2 = "[{\"car_park_id\":\"342967\",\"car_park_name\":\"西溪花园5号测试\"}]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVos2 = JSON.parseArray(jsonStr2, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVos2.toString());

        String jsonStr3 = "[{\"car_park_id\":\"989340\",\"car_park_name\":\"无人值守6号6停车场\"},{\"car_park_id\":\"1001574\",\"car_park_name\":\"无人值守研发车场\"}]";
        List<CouponsCarParkLimitVo> couponsCarParkLimitVo3 = JSON.parseArray(jsonStr3, CouponsCarParkLimitVo.class);
        System.out.println(couponsCarParkLimitVo3.toString());

    }

    /**
     * 反序列化
     * */
    @Test
    void test7() {
        //String str1 = "{\"park_ids\":\"\"}";
        //String str1 = "{\"park_ids\":\"1\"}";
        String str1 = "{\"park_ids\":\"1,2,3,4\"}";
        //String str1 = "";



        JSONObject paramJsonObject = JSON.parseObject(str1);
        String parkIdsStr = paramJsonObject.getString("park_ids");

        JSONObject responseJsonObject = new JSONObject();
        if(StringUtils.isBlank(parkIdsStr)) {
            responseJsonObject.put("card_ids", "");
            log.info("{}", responseJsonObject.toJSONString());
            return;
        }
        List<String> parkIdList = Stream.of(parkIdsStr.split(",")).filter(StringUtils::isNotBlank)
                .map(String::trim).distinct().collect(Collectors.toList());

        Map<String, String> resMap = Collections.singletonMap("card_ids", String.join(",", parkIdList));
        log.info("{}", JSON.toJSONString(resMap));

    }



}
