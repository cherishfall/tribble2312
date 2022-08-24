package entity.dto;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * MessageDataDTO
 *
 * @author lifan
 * @since 2022-06-17 15:01
 * */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class MessageDataDTO {

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
    private Integer detectorType;

    @ApiModelProperty(value = "进场id", name = "iuid")
    @JsonProperty(value = "iuid")
    private String iuid;

    @ApiModelProperty(value = "出场id", name = "ouid")
    @JsonProperty(value = "ouid")
    private String ouid;

    @ApiModelProperty(value = "进出场uid", name = "io_uid")
    @JsonProperty(value = "io_uid")
    private String ioUid;

    @ApiModelProperty(value = "进出场时间", name = "io_datetime")
    @JsonProperty(value =  "io_datetime")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GTM+8")
    private LocalDateTime ioDatetime;

}

