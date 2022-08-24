package com.tribble.tribblemybatis.entity.po;

/**
 * @author lifan
 * @since 2022/8/10 7:55 PM
 */
public class CdkeyBo implements Comparable<CdkeyBo>{

    /**
     * 记录ID
     */
    private int id;
    /**
     * 兑换码
     */
    private String cdkey;
    /**
     * 卡券code
     */
    private String cardCode;

    /**
     * 卡券券种id
     * */
    private String cardId;

    /**
     * 库存
     */
    private String inventory;
    /**
     * 兑换码类型
     */
    private String cdkeyType;
    /**
     * 状态
     */
    private String status;
    /**
     * 用户ID
     */
    private String rccUserId;
    /**
     * 创建人ID
     */
    private String createUserId;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 修改时间
     */
    private String updateTime;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCdkey() {
        return cdkey;
    }
    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
    }
    public String getCardCode() {
        return cardCode;
    }
    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }
    public String getInventory() {
        return inventory;
    }
    public void setInventory(String inventory) {
        this.inventory = inventory;
    }
    public String getCdkeyType() {
        return cdkeyType;
    }
    public void setCdkeyType(String cdkeyType) {
        this.cdkeyType = cdkeyType;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getRccUserId() {
        return rccUserId;
    }
    public void setRccUserId(String rccUserId) {
        this.rccUserId = rccUserId;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
    public String getCreateUserId() {
        return createUserId;
    }
    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    @Override
    public int compareTo(CdkeyBo o) {
        return o.getId() - this.id;
    }
}
