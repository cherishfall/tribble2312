package com.tribble.tribblefast.entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;

/**
 * 用于通用的消费DTO
 *
 * @param <T>
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDTO<T> {

    @ApiModelProperty("数据类型，100:修正，110：确认在场，200：删除")
    @JsonProperty("data_type")
    private Integer dataType;

    @ApiModelProperty("发送的时间")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("data_datetime")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime dataDatetime;

    @ApiModelProperty("数据")
    private T data;

    public MessageDTO() {
    }

    public MessageDTO(Integer dataType, T data) {
        this.dataType = dataType;
        this.dataDatetime = LocalDateTime.now();
        this.data = data;
    }

    public Integer getDataType() {
        return this.dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public LocalDateTime getDataDatetime() {
        return this.dataDatetime;
    }

    public void setDataDatetime(LocalDateTime dataDatetime) {
        this.dataDatetime = dataDatetime;
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "MessageDTO{" +
            "dataType=" + dataType +
            ", dataDatetime=" + dataDatetime +
            ", data=" + data +
            '}';
    }
}
