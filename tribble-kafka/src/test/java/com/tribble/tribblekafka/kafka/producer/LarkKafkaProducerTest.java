package com.tribble.tribblekafka.kafka.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tribble.tribblekafka.properties.KafkaTopicProperties;
import entity.dto.AbnormalDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Slf4j
class LarkKafkaProducerTest {
    @Autowired
    ObjectMapper objectMapper;

    @Autowired
    KafkaTopicProperties kafkaTopicProperties;

    @Autowired
    LarkKafkaProducer larkKafkaProducer;

    @Test
    public void test1() {
        log.info("test1");
    }

    @Test
    void test2() throws Exception {
        String jsonStr1 = "{\"abnormal_type\":\"1006\",\"abnormal_datetime\":\"2022-04-08 19:38:39\",\"logic_datetime\":\"2022-04-08 19:37:02\"" +
                ", \"abnormal_data\":[{\"iouid\":\"70d91222-836e-4c93-81c8-c3a14ddf1a06\",\"detector\":\"RF_50_00000250\",\"detector_type\":1,\"bucket_id\":\"13\",\"evidence_chain_id\":null,\"car_park_id\":\"6\"" +
                ",\"plate_no\":\"闽ABC006\",\"parking_space_no\":\"J77006\",\"io_datetime\":\"2022-04-08 19:37:02\",\"plate_color\":\"1\",\"picture_id\":\"70d91222-836e-4c93-81c8-c3a14ddf1a01\",\"parking_abnormal_type\":null,\"all_parking_space_no\":\"J07056\",\"data_source\":\"1\",\"abnormal_index\":\"1\"}]}";

        AbnormalDTO abnormalDTO = objectMapper.readValue(jsonStr1, AbnormalDTO.class);
        String parkingSpaceNo = abnormalDTO.getAbnormalData().get(0).getParkingSpaceNo();
        larkKafkaProducer.produce(kafkaTopicProperties.getSwallowAbnormalTopic(), parkingSpaceNo, abnormalDTO);

        log.info("larkKafkaProducer end");
    }
}