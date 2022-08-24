package com.tribble.tribblefast.entity.po;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * @author cherishfall
 */
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class MyPerson {
  String name;
  Integer age;

  @JSONField(format = "yyyy-MM-dd HH:mm:ss")
  LocalDateTime birthDateTime;

  @JSONField(name = "date_time_field_one")
  LocalDateTime dateTimeFieldOne;

  Boolean dead;
}
