package com.tribble.tribblemybatis.entity.po;

/**
 * 券种和可使用车场对应关系
 *
 * @author lifan
 * @since 2022/8/9 10:40 AM
 */
public class CardParkRelBo {
    /** id*/
    private Long id;

    /** 券种id*/
    private String cardId;

    /** 卡券编号*/
    private String cardCode;

    /** 可使用车场id*/
    private String parkId;

    public CardParkRelBo() {
    }

    public CardParkRelBo(String cardId, String cardCode, String parkId) {
        this.cardId = cardId;
        this.cardCode = cardCode;
        this.parkId = parkId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getParkId() {
        return parkId;
    }

    public void setParkId(String parkId) {
        this.parkId = parkId;
    }
}
