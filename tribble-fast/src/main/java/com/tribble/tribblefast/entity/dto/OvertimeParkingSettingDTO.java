package com.tribble.tribblefast.entity.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lifan
 * @since 2022/8/26 5:13 PM
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OvertimeParkingSettingDTO {
    public static final OvertimeParkingSettingDTO DEFAULT_SETTING = getDefaultSetting();
    public static final String KEY = "LARK_OVERTIME_PARKING";

    @ApiModelProperty(value = "超时停车查询查询多长时间前的相似停车记录,单位为小时,默认1小时", name = "before_query_time_span")
    @JsonProperty("before_query_time_span")
    private Integer beforeQueryTimeSpan;

    @ApiModelProperty(value = "超时停车查询查询多长时间后的相似停车记录,单位为小时,默认12小时", name = "after_query_time_span")
    @JsonProperty("after_query_time_span")
    private Integer afterQueryTimeSpan;

    @ApiModelProperty(value = "超时停车场内记录领先相似停车记录阈值,单位为分钟", name = "inner_record_before_parking_record_threshold")
    @JsonProperty("inner_record_ahead_parking_record_threshold,默认17分钟")
    private Integer innerRecordAheadParkingRecordThreshold;

    private static OvertimeParkingSettingDTO getDefaultSetting() {
        OvertimeParkingSettingDTO defaultSetting = new OvertimeParkingSettingDTO();
        defaultSetting.setAfterQueryTimeSpan(1);
        defaultSetting.setAfterQueryTimeSpan(12);
        defaultSetting.setInnerRecordAheadParkingRecordThreshold(17);
        return defaultSetting;
    }

}
