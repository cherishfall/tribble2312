package com.tribble.tribblefast.enums;

/**
 * @author lifan
 * @since 2022/7/21 5:27 PM
 */
public enum DetectorTypeEnum {
    SWALLOW(-10000, "整合服务"),
    LARK(-10001, "告警服务"),
    HIGH_CAMERA(1, "高杆相机"),
    SHORT_CAMERA(2, "低杆相机"),
    MAG_INDUCTION(3, "地磁"),
    HANDSET(4, "手持机"),
    PHOENIX_WEB(5, "云座席"),
    EVIDENCE_CAMERA(6, "证据相机"),
    SYSTEM(7, "系统");

    public final Integer type;
    public final String typeStr;
    public final String remake;

    private DetectorTypeEnum(Integer type, String remake) {
        this.type = type;
        this.typeStr = type.toString();
        this.remake = remake;
    }


}
