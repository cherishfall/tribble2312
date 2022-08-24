package com.tribble.tribblefast.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 跨位停车配置
 *
 * @author lifan
 * @since 2022-06-09 15:34
 * */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Slf4j
public class CrossBerthParkingSettingDTO {
    public static  final CrossBerthParkingSettingDTO DEFAULT_SETTING = getDefaultSetting();
    @ApiModelProperty(value = "是否开启跨位停车管理", name = "enable_cross_berth_parking")
    @JsonProperty("enable_cross_berth_parking")
    private Boolean enableCrossBerthParking;

    @ApiModelProperty(value = "查询多少时间内跨位停车异常,单位为小时", name = "query_time_span")
    @JsonProperty("query_time_span")
    private Integer queryTimeSpan;

    @ApiModelProperty(value = "短时停车阈值,单位秒", name = "short_parking_threshold")
    @JsonProperty("short_parking_threshold")
    private Integer shortParkingThreshold;

    @ApiModelProperty(value = "跨位停车定时任务查询最后n条记录", name = "last_n_record")
    @JsonProperty("last_n_record")
    private Integer lastNRecord;

    private static CrossBerthParkingSettingDTO getDefaultSetting() {
        CrossBerthParkingSettingDTO defaultSetting = new CrossBerthParkingSettingDTO();
        defaultSetting.setEnableCrossBerthParking(false);
        defaultSetting.setQueryTimeSpan(72);
        defaultSetting.setShortParkingThreshold(300);
        defaultSetting.setLastNRecord(5);
        return defaultSetting;
    }




}
