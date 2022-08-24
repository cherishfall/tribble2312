package com.tribble.tribblefast.json;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tribble.tribblefast.entity.dto.CrossBerthParkingSettingDTO;
import com.tribble.tribblefast.entity.dto.MessageDTO;
import com.tribble.tribblefast.entity.dto.MessageDataDTO;
import com.tribble.tribblefast.entity.vo.Shape;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
@Slf4j
public class JacksonTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void test1() throws JsonProcessingException {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("enable_cross_berth_parking", "true");
        stringMap.put("query_time_span", "72");
        stringMap.put("short_parking_threshold", "300");
        stringMap.put("last_n_record", "5");
        String jsonStr = objectMapper.writeValueAsString(stringMap);
        log.info("jsonStr:\n{}", jsonStr);
        CrossBerthParkingSettingDTO crossBerthParkingSettingDTO = objectMapper.readValue(jsonStr, CrossBerthParkingSettingDTO.class);
        log.info("jsonStr 反序列化:\n{}", crossBerthParkingSettingDTO);

    }

    @Test
    public void test2() throws JsonProcessingException {
        String jsonStr = "{\"enable_cross_berth_parking\":\"true\",\"query_time_span\":\"72\",\"short_parking_threshold\":\"300\",\"last_n_record\":\"5\"}";
        CrossBerthParkingSettingDTO crossBerthParkingSettingDTO = objectMapper.readValue(jsonStr, CrossBerthParkingSettingDTO.class);
        log.info("jsonStr 反序列化:\n{}", crossBerthParkingSettingDTO);

    }

    @Test
    public void test3() throws JsonProcessingException {
        String jsonStr =
                "{\"data_datetime\":\"2022-06-15 22:19:04\",\"data\":{\"io_datetime\":\"2022-06-15 22:18:47\",\"plate_color\":\"1\",\"io_count\":1,\"io_steady_datetime\":\"2022-06-15 22:18:21\",\"plate_no_reliability\":\"1.000000\",\"package_id\":2074,\"io_affirming_datetime\":\"2022-06-15 22:18:47\",\"muid\":\"RF_50_0000013813c95889-8a904939-11-1655302733351\",\"bucket_id\":\"571\",\"parking_abnormal_type\":0,\"order_score\":\"100\",\"group_id\":\"1647\",\"inout_type\":1,\"plate_no\":\"闽GX1707\",\"iuid\":\"d219222b-4ff6-45d7-a80a-53f6bd1f88c7\",\"parking_space_no\":\"J19070\",\"receive_datetime\":\"2022-06-15 22:19:04\",\"detector\":\"RF_50_00000138\",\"detector_type\":1},\"data_type\":1}";
        System.out.println(jsonStr);

        MessageDTO<MessageDataDTO> messageDTO = objectMapper.readValue(jsonStr, new TypeReference<MessageDTO<MessageDataDTO>>() {});
        MessageDataDTO data = messageDTO.getData();
        String plateNo = data.getPlateNo();
        System.out.println(plateNo);


    }

    @Test
    public void test4() throws JsonProcessingException {
        String jsonStr =
                "{\"data_datetime\":\"2022-06-15 22:20:27\",\"data\":{\"io_datetime\":\"2022-06-15 22:20:02\",\"plate_color\":\"1\",\"io_count\":2,\"io_steady_datetime\":\"2022-06-15 22:19:45\",\"plate_no_reliability\":\"1.000000\",\"package_id\":2076,\"io_affirming_datetime\":\"2022-06-15 22:19:45\",\"muid\":\"RF_50_0000013813c95889-8a904939-11-1655302815857\",\"bucket_id\":\"571\",\"parking_abnormal_type\":0,\"order_score\":\"100\",\"ouid\":\"61cec824-127f-4a70-8e43-40882dace78e\",\"group_id\":\"1647\",\"inout_type\":0,\"plate_no\":\"闽GX1707\",\"parking_space_no\":\"J19070\",\"receive_datetime\":\"2022-06-15 22:20:27\",\"detector\":\"RF_50_00000138\",\"detector_type\":1},\"data_type\":0}";
        System.out.println(jsonStr);

        MessageDTO<MessageDataDTO> messageDTO = objectMapper.readValue(jsonStr, new TypeReference<MessageDTO<MessageDataDTO>>() {});
        MessageDataDTO data = messageDTO.getData();
        String plateNo = data.getPlateNo();
        System.out.println(plateNo);
    }

    /**
     * 测试 @JsonInclude(JsonInclude.Include.NON_NULL) 行为
     * */
    @Test
    void test5() throws JsonProcessingException{
        Shape shape = new Shape();
        String jsonStr = objectMapper.writeValueAsString(shape);
        log.info("{}", jsonStr);
        // {"var1":null,"var2":null,"var3":null}
    }




}
