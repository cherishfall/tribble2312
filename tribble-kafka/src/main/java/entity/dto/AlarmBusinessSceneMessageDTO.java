package entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * 告警服务特殊情景发送Kafka消息DTO
 *
 * @author lifan
 * @since 2022-05-07 15:41
 * */
@Data
@NoArgsConstructor
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlarmBusinessSceneMessageDTO {

    @ApiModelProperty(value = "数据id", name = "data_id")
    @JsonProperty("data_id")
    private String dataId;

    @ApiModelProperty(value = "数据类型", name = "data_type")
    @JsonProperty("data_type")
    private Integer dataType;

    @ApiModelProperty(value = "数据发送时间", name = "data_datetime")
    @JsonProperty("data_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime dataDatetime;

    @ApiModelProperty(value = "数据", name = "data")
    @JsonProperty("data")
    private AlarmBusinessSceneDataDTO data;

    public static AlarmBusinessSceneMessageDTO of(Integer dataType, AlarmBusinessSceneDataDTO data) {
        AlarmBusinessSceneMessageDTO message = new AlarmBusinessSceneMessageDTO();
        message.setDataId(UUID.randomUUID().toString());
        message.setDataType(dataType);
        message.setDataDatetime(LocalDateTime.now());
        message.setData(data);
        return message;
    }

}
