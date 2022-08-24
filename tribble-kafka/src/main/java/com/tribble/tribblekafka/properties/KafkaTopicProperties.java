package com.tribble.tribblekafka.properties;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 从配置中心读取kafka的topic相关的配置类
 *
 * @version 1.0
 * @author: Fan
 * @date 2021/10/26 17:59
 */
@Component
//@RefreshScope
@Data
public class KafkaTopicProperties {

  /**
   * swallow_abnormal对应的topic
   */
  @Value("${com.reformer.lark.properties.KafkaTopicProperties.swallowAbnormalTopic:swallow_abnormal}")
  private String swallowAbnormalTopic;
  /**
   * swallow_abnormal_delete对应的topic
   */
  @Value("${com.reformer.lark.properties.KafkaTopicProperties.swallowAbnormalDelete:swallow_abnormal_delete}")
  private String swallowAbnormalDelete;
  /**
   * swallow_inout_record对应的topic
   */
  @Value("${com.reformer.lark.properties.KafkaTopicProperties.swallowInoutRecord:swallow_inout_record}")
  private String swallowInoutRecord;

  /** 特殊场景处理日志对应的topic*/
  @Value("${com.reformer.lark.properties.KafkaTopicProperties.businessScene:business_scene}")
  private String businessSceneTopic;
}
