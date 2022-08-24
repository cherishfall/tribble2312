package com.tribble.tribblekafka.kafka.producer;

import com.fasterxml.jackson.databind.ObjectMapper;
import entity.dto.MessageDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFutureCallback;

import javax.annotation.Resource;

/**
 * @version 1.0
 * @author: Fan
 * @date 2021.1.22 10:03
 */
@Component
@Slf4j
public class LarkKafkaProducer {

  @Resource
  ObjectMapper objectMapper;

  @Resource
  KafkaTemplate<String, Object> kafkaTemplate;

  public <T> void produceMessageDTO(String topic, String key, int dataType, T data) throws Exception {
    doProduce(topic, key, objectMapper.writeValueAsString(new MessageDTO<>(dataType, data)));
  }

  public <T> void produce(String topic, String key, T data) throws Exception {
    String msg = "";
    if (data.getClass() == String.class) {
      // 如果是String的话直接转，不然去objectMapper重新写一遍会导致带上多余引号
      msg = (String)data;
    } else {
      msg = objectMapper.writeValueAsString(data);
    }
    doProduce(topic, key, msg);
  }

  public void doProduce(String topic, String key, String kafkaMsg) {
    log.info("=================>发送kafka:topic={},key={},kafkaMsg={}", topic, key, kafkaMsg);
    kafkaTemplate.send(topic, key, kafkaMsg)
        .addCallback(new ListenableFutureCallback<SendResult<String, Object>>() {
          @Override
          public void onFailure(Throwable e) {
            log.error("发送消息失败：" , e);
          }

          @Override
          public void onSuccess(SendResult<String, Object> result) {
            log.info("发送消息成功：" + result.getRecordMetadata().topic() + "-"
                + result.getRecordMetadata().partition() + "-" + result.getRecordMetadata().offset());
          }
        });
  }
}
