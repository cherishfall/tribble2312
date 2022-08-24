package com.tribble.tribblemysql.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Objects;

/**
 * <p>
 * 车位表
 * </p>
 *
 * @author wangzz
 * @since 2020-12-28
 */
@Data
@EqualsAndHashCode(callSuper = false)
@TableName("parking_space")
public class ParkingSpace implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 是否启用
     */
    private Boolean isEnable;
    /**
     * 主键
     */
    @TableId(value = "parking_space_id", type = IdType.AUTO)
    private Integer parkingSpaceId;
    /**
     * 车位号唯一标识
     */
    private String parkingSpaceNo;
    /**
     * 车位占用状态 0 ：未占用 1: 已占用
     */
    private Boolean parkingTakeUpState;
    /**
     * 车场id
     */
    private Integer carParkId;
    /**
     * 创建人
     */
    private String createUser;
    /**
     * 更新人
     */
    private String updateUser;
    /**
     * 创建时间
     */
    private LocalDateTime createTime;
    /**
     * 更新时间
     */
    private LocalDateTime updateTime;
    /**
     * 是否删除
     */
    private Boolean isDelete;
    /**
     * 车位运营模式
     */
    private String operationModeCode;
    /**
     * 车位位置排序编码
     */
    private Integer serialNumber;

    /**
     * 组号
     */
    private Integer groupNumber;

    /**
     * 中间件是否往第三方推送 0 不推 1推
     */
    private Boolean middlewareSplitFlow;

    /**
     * 是否直接往路侧推 0不推 1推
     */
    private Boolean geoSplitFlow;

    /**
     * 是否过滤此泊位的无车牌数据 true：过滤 false:保留（默认）
     */
    private Boolean needFilter;

    /**
     * 更新(删除)时操作人信息初始化
     *
     * @param userInfo
     */
    public void initUpdateUserInfo(UserInfo userInfo) {
        this.updateTime = LocalDateTime.now(ZoneId.of("+08:00"));
        if (!Objects.isNull(userInfo)) {
            this.updateUser = userInfo.getId().toString();
        }
    }

    /**
     * 插入记录时操作人信息初始化
     *
     * @param userInfo
     */
    public void initCreateUserInfo(UserInfo userInfo) {
        this.createTime = LocalDateTime.now(ZoneId.of("+08:00"));
        if (!Objects.isNull(userInfo)) {
            this.createUser = userInfo.getId().toString();
        }
        initUpdateUserInfo(userInfo);
    }


}

