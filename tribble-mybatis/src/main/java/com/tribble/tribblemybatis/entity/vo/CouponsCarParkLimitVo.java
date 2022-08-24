package com.tribble.tribblemybatis.entity.vo;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 卡券停车场限制
 * @author hongwen.li
 *
 */
public class CouponsCarParkLimitVo {

	/**
	 * 卡券适用停车场ID集合
	 */
	@JSONField(name="car_park_id")
	private String rccCarParkId;
	/**
	 * 卡券适用停车场名称集合
	 */
	@JSONField(name="car_park_name")
	private String rccCarParkName;
	/**
	 * 机构code
	 */
	@JSONField(name = "framework_code")
	private String frameworkCode;
	/**
	 * 机构名称
	 */
	@JSONField(name = "framework_name")
	private String frameworkName;
	
	public String getRccCarParkId() {
		return rccCarParkId;
	}
	public void setRccCarParkId(String rccCarParkId) {
		this.rccCarParkId = rccCarParkId;
	}
	public String getRccCarParkName() {
		return rccCarParkName;
	}
	public void setRccCarParkName(String rccCarParkName) {
		this.rccCarParkName = rccCarParkName;
	}

	public String getFrameworkCode() {
		return frameworkCode;
	}

	public void setFrameworkCode(String frameworkCode) {
		this.frameworkCode = frameworkCode;
	}

	public String getFrameworkName() {
		return frameworkName;
	}

	public void setFrameworkName(String frameworkName) {
		this.frameworkName = frameworkName;
	}
}
