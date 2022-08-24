package entity.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @version 1.0
 * @author: Fan
 * @date 2020.12.18 14:48
 */
public class AbnormalDTO {

  @JsonProperty(value = "abnormal_type")
  private String abnormalType;
  @JsonProperty(value = "abnormal_datetime")
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime abnormalDatetime;
  @JsonProperty(value = "logic_datetime")
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime logicDatetime;
  @JsonProperty(value = "abnormal_data")
  private List<AbnormalDataDTO> abnormalData;

  public String getAbnormalType() {
    return this.abnormalType;
  }

  public AbnormalDTO setAbnormalType(String abnormalType) {
    this.abnormalType = abnormalType;
    return this;
  }

  public LocalDateTime getAbnormalDatetime() {
    return this.abnormalDatetime;
  }

  public AbnormalDTO setAbnormalDatetime(LocalDateTime abnormalDatetime) {
    this.abnormalDatetime = abnormalDatetime;
    return this;
  }

  public List<AbnormalDataDTO> getAbnormalData() {
    return this.abnormalData;
  }

  public AbnormalDTO setAbnormalData(
      List<AbnormalDataDTO> abnormalData) {
    this.abnormalData = abnormalData;
    return this;
  }

  public LocalDateTime getLogicDatetime() {
    return this.logicDatetime;
  }

  public AbnormalDTO setLogicDatetime(LocalDateTime logicDatetime) {
    this.logicDatetime = logicDatetime;
    return this;
  }

  @Override
  public String toString() {
    return "AbnormalDTO{" +
        "abnormalType='" + abnormalType + '\'' +
        ", abnormalDatetime=" + abnormalDatetime +
        ", abnormalData=" + abnormalData +
        '}';
  }
}
