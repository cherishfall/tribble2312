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

/**
 * 告警服务特殊场景数据DTO
 *
 * @author lifan
 * @since 2022-05-07 16:16
 * */
@Data
@NoArgsConstructor
@ApiModel
@JsonIgnoreProperties(ignoreUnknown = true)
public class AlarmBusinessSceneDataDTO {

    @ApiModelProperty(value = "告警类型", name = "alarm_type")
    @JsonProperty(value = "alarm_type")
    private String alarmType;
    @ApiModelProperty(value = "异常类型", name = "abnormal_type")
    @JsonProperty(value = "abnormal_type")
    private String abnormalType;
    @ApiModelProperty(value = "异常产生时间", name = "abnormal_datetime")
    @JsonProperty(value = "abnormal_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime abnormalDatetime;

    @ApiModelProperty(value = "进出场uid", name = "io_uid")
    @JsonProperty(value = "io_uid")
    private String ioUid;

    @ApiModelProperty(value = "进出场时间", name = "io_datetime")
    @JsonProperty(value =  "io_datetime")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private LocalDateTime ioDatetime;

    @ApiModelProperty(value = "车牌号", name = "plate_no")
    @JsonProperty(value =  "plate_no")
    private String plateNo;

    @ApiModelProperty(value = "车牌颜色: 0未知, 1蓝色, 2黄色, 3白色, 4黑色, 5绿色, 6红色", name = "plate_color")
    @JsonProperty(value =  "plate_color")
    private String plateColor;

    @ApiModelProperty(value = "车位编号", name = "parking_space_no")
    @JsonProperty(value =  "parking_space_no")
    private String parkingSpaceNo;

    @ApiModelProperty(value = "车位组id", name = "bucket_id")
    @JsonProperty(value =  "bucket_id")
    private String bucketId;

    @ApiModelProperty(value = "车场id", name = "car_park_id")
    @JsonProperty(value =  "car_park_id")
    private String carParkId;

    @ApiModelProperty(value = "检测源（设备ID/操作员ID）", name = "detector")
    @JsonProperty(value =  "detector")
    private String detector;

    @ApiModelProperty(value = "检测源类型: 1高杆, 2低杆, 3地磁, 4手持机, 5云座席, 6证据相机", name = "detector_type")
    @JsonProperty(value =  "detector_type")
    private String detectorType;

    @ApiModelProperty(value = "图片id", name = "picture_id")
    @JsonProperty("picture_id")
    private String pictureId;

    @ApiModelProperty(value = "证据链id", name = "evidence_chain_id")
    @JsonProperty(value =  "evidence_chain_id")
    private String evidenceChainId;

    @ApiModelProperty(value = "确认不在场时间", name = "confirm_not_in_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("confirm_not_in_datetime")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime confirmNotInDatetime;

    @ApiModelProperty(value = "疑似不在场时间", name = "maybe_not_in_datetime")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @JsonProperty("maybe_not_in_datetime")
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    private LocalDateTime maybeNotInDatetime;

}
