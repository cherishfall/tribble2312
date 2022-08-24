package com.tribble.tribblemybatis.entity.po;

/**
 * 卡券BO
 * @author hongwen.li
 *
 */
public class CouponsBo {

	/**
	 * 卡券ID
	 */
	private String cardId;
	/**
	 * 卡券记录code
	 */
	private String cardCode;
	/**
	 * 卡券名称
	 */
	private String cardName;
	/**
	 * 卡券父级code
	 */
	private String parentCardCode;
	/**
	 * 额度code
	 */
	private String capacityCode;
	/**
	 * 额度当前库存
	 */
	private String capacityInventory;
	/**
	 * 卡券有效期开始时间
	 */
	private String rccDiscountStartTime;
	/**
	 * 卡券有效期结束时间
	 */
	private String rccDiscountEndTime;
	/**
	 * 卡券当前库存
	 */
	private String rccInventory;
	/**
	 * 卡券总库存
	 */
	private String rccTotalInventory;
	/**
	 * 卡券优惠数量
	 */
	private String rccDiscount;
	/**
	 * 卡券创建人
	 */
	private String rccCreateUser;
	/**
	 * 卡券创建人ID
	 */
	private String rccCreateUserId;
	/**
	 * 卡券创建时间
	 */
	private String rccCreateTime;
	/**
	 * 卡券修改人
	 */
	private String rccUpdateUser;
	/**
	 * 卡券修改人ID
	 */
	private String rccUpdateUserId;
	/**
	 * 卡券修改时间
	 */
	private String rccUpdateTime;
	/**
	 * 卡券状态
	 */
	private String rccState;
	
	/**
	 * 卡券类型
	 */
	private String rccType;
	
	/**
	 * 优惠券拥有者code
	 */
	private String rccHoldersCode;
	/**
	 * 优惠券拥有者名称
	 */
	private String rccHoldersName;
	/**
	 * 优惠券来源code
	 */
	private String rccSourceCode;
	/**
	 * 优惠券来源名称
	 */
	private String rccSourceName;
	/**
	 * 查询信息
	 */
	private String rccCarParkInfo;
	/**
	 * 售卖金额
	 */
	private String rccAmount;
	/**
	 * 扩展信息
	 */
	private String extendObj;
	/**
	 * 条件限制信息
	 */
	private String extendLimits;

	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getCapacityCode() {
		return capacityCode;
	}
	public void setCapacityCode(String capacityCode) {
		this.capacityCode = capacityCode;
	}
	public String getRccDiscountStartTime() {
		return rccDiscountStartTime;
	}
	public void setRccDiscountStartTime(String rccDiscountStartTime) {
		this.rccDiscountStartTime = rccDiscountStartTime;
	}
	public String getRccDiscountEndTime() {
		return rccDiscountEndTime;
	}
	public void setRccDiscountEndTime(String rccDiscountEndTime) {
		this.rccDiscountEndTime = rccDiscountEndTime;
	}
	public String getRccInventory() {
		return rccInventory;
	}
	public void setRccInventory(String rccInventory) {
		this.rccInventory = rccInventory;
	}
	public String getRccTotalInventory() {
		return rccTotalInventory;
	}
	public void setRccTotalInventory(String rccTotalInventory) {
		this.rccTotalInventory = rccTotalInventory;
	}
	public String getRccDiscount() {
		return rccDiscount;
	}
	public void setRccDiscount(String rccDiscount) {
		this.rccDiscount = rccDiscount;
	}
	public String getRccCreateUser() {
		return rccCreateUser;
	}
	public void setRccCreateUser(String rccCreateUser) {
		this.rccCreateUser = rccCreateUser;
	}
	public String getRccCreateTime() {
		return rccCreateTime;
	}
	public void setRccCreateTime(String rccCreateTime) {
		this.rccCreateTime = rccCreateTime;
	}
	public String getRccUpdateUser() {
		return rccUpdateUser;
	}
	public void setRccUpdateUser(String rccUpdateUser) {
		this.rccUpdateUser = rccUpdateUser;
	}
	public String getRccUpdateTime() {
		return rccUpdateTime;
	}
	public void setRccUpdateTime(String rccUpdateTime) {
		this.rccUpdateTime = rccUpdateTime;
	}
	public String getRccState() {
		return rccState;
	}
	public void setRccState(String rccState) {
		this.rccState = rccState;
	}
	public String getRccType() {
		return rccType;
	}
	public void setRccType(String rccType) {
		this.rccType = rccType;
	}
	public String getRccHoldersCode() {
		return rccHoldersCode;
	}
	public void setRccHoldersCode(String rccHoldersCode) {
		this.rccHoldersCode = rccHoldersCode;
	}
	public String getRccSourceCode() {
		return rccSourceCode;
	}
	public void setRccSourceCode(String rccSourceCode) {
		this.rccSourceCode = rccSourceCode;
	}
	public String getRccCreateUserId() {
		return rccCreateUserId;
	}
	public void setRccCreateUserId(String rccCreateUserId) {
		this.rccCreateUserId = rccCreateUserId;
	}
	public String getRccUpdateUserId() {
		return rccUpdateUserId;
	}
	public void setRccUpdateUserId(String rccUpdateUserId) {
		this.rccUpdateUserId = rccUpdateUserId;
	}
	public String getRccHoldersName() {
		return rccHoldersName;
	}
	public void setRccHoldersName(String rccHoldersName) {
		this.rccHoldersName = rccHoldersName;
	}
	public String getRccSourceName() {
		return rccSourceName;
	}
	public void setRccSourceName(String rccSourceName) {
		this.rccSourceName = rccSourceName;
	}
	public String getRccCarParkInfo() {
		return rccCarParkInfo;
	}
	public void setRccCarParkInfo(String rccCarParkInfo) {
		this.rccCarParkInfo = rccCarParkInfo;
	}
	public String getCardCode() {
		return cardCode;
	}
	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}
	public String getParentCardCode() {
		return parentCardCode;
	}
	public void setParentCardCode(String parentCardCode) {
		this.parentCardCode = parentCardCode;
	}
	public String getRccAmount() {
		return rccAmount;
	}
	public void setRccAmount(String rccAmount) {
		this.rccAmount = rccAmount;
	}
	public String getExtendObj() {
		return extendObj;
	}
	public void setExtendObj(String extendObj) {
		this.extendObj = extendObj;
	}
	public String getExtendLimits() {
		return extendLimits;
	}
	public void setExtendLimits(String extendLimits) {
		this.extendLimits = extendLimits;
	}

	public String getCapacityInventory() {
		return capacityInventory;
	}

	public void setCapacityInventory(String capacityInventory) {
		this.capacityInventory = capacityInventory;
	}
}
