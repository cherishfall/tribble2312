package com.tribble.tribblekafka.kafka.consumer;

import com.tribble.tribblekafka.properties.KafkaTopicProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


/**
 * @version 1.0
 * @author: Fan
 * @date 2020.12.18 14:29
 */
@Component
@Slf4j
public class LarkKafkaConsumer {

  @Value("#{'${spring.kafka.consumer.topic-name}'.split(',')}")
  private String[] topics;

  private KafkaTopicProperties kafkaTopicProperties;

  @Autowired
  public LarkKafkaConsumer(KafkaTopicProperties kafkaTopicProperties) {
    this.kafkaTopicProperties = kafkaTopicProperties;
  }

  @KafkaListener(topics = "#{'${spring.kafka.consumer.topic-name}'.split(',')}",
      concurrency = "${spring.kafka.consumer.concurrency:1}",
      errorHandler = "globalErrorHandler")
  public void onMessage(ConsumerRecord<String, String> record) {
    String value = record.value();
    if (StringUtils.isBlank(value)) {
      log.warn("[LarkKafkaConsumer.onMessage] topic {} the offset {} get value null",
          record.topic(), record.offset());
    }
    log.info("[LarkKafkaConsumer.onMessage] receive msg.topic is {}, key is {}, value is {}",
        record.topic(), record.key(), record.value());

    log.info("[LarkKafkaConsumer.onMessage] end consumer!");
  }

}
