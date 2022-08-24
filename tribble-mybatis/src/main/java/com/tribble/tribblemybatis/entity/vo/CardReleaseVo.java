package com.tribble.tribblemybatis.entity.vo;

/**
 * @author lifan
 * @since 2022/8/11 2:32 PM
 */

import com.alibaba.fastjson2.JSONObject;

import java.util.List;

/**
 * 用户卡券模型
 *
 * @author Administrator
 */
public class CardReleaseVo {

    /**
     * 优惠编号
     */
    private String discount_code;

    /**
     * 发放者ID
     */
    private String rspc_seller_id;

    /**
     * 发放者类型（1合作方【包括立方、停车场】，2商铺）
     */
    private String rspc_seller_type;

    /**
     * 商场ID,发放者类型为2商铺时，这里必填
     */
    private String rspc_market_id;

    /**
     * 卡券生成时间
     */
    private String rcci_create_time;

    /**
     * 卡券使用开始时间
     */
    private String rcci_limit_starttime;

    /**
     * 卡券使用截止时间
     */
    private String rcci_limit_endtime;

    /**
     * 卡券拥有者的用户id
     */
    private String rcci_user_id;

    /**
     * 券种ID
     */
    private String card_id;

    /**
     * 券种Id列表
     */
    private List<String> card_id_list;

    /**
     * 券种名称
     */
    private String card_name;

    /**
     * 状态：0已使用，1未使用，2过期，3使用中，4已退款，5申请退款中，6退款转账中,7未生效
     */
    private String rcci_state;

    /**
     * 反扫锁定状态：0未锁定，1锁定中
     */
    private Boolean plate_lock_state;

    /**
     * 反扫锁定车牌
     */
    private String locked_plate;

    /**
     * 卡券状态变更时间
     */
    private String rcci_change_time;

    /**
     * 服务类型 停车服务 、洗车服务....
     */
    private String server_type;

    /**
     * 券种类型：10代金券 11抵扣券 13打折券 14时间券   30余额卡 31记次卡
     */
    private String card_type;

    /**
     * 优惠券适用的停车类型 -1 不限制 1临停 2预约
     */
    private String stop_type;

    /**
     * 卡券面额/使用次数,金钱单位分，次数单位次
     */
    private int rcci_num;

    /**
     * 发券员ID
     */
    private String rcci_salesman_id;

    /**
     * 优惠券锁定时间
     */
    private String rcci_lock_time;

    /**
     * 购买记录编号
     */
    private String rcci_transaction_id;

    /**
     * 给长期卡、周末卡提供服务,里面存放长期卡周末卡指定使用的车牌（其它车牌则不能使用）
     */
    private String rcci_long_plate;

    /**
     * 券材质类型 0纸质券 1电子券，默认电子券
     */
    private String rcci_kind;

    /**
     * 使用限制范围
     * json格式，
     * {
     * "area(区域)":"-1(不限制)/province(省),city(市),country(区)",
     * "server(服务)":"-1(不限制)/1(停车券),2(洗车券)",
     * "parkid":"-1(不限制)/1(停车场1),2(停车场2)",
     * "channel":"-1(不限制)/1(渠道1),2(渠道2)",
     * "pay(支付渠道)":"-1(不限制)/1,2,3(各种付款渠道编码)"
     * }
     */
    private String card_limit_range;

    /**
     * 券种扩展字段: 券种其它不重要的字段都放在这里
     * json格式，
     * {
     * "rcc_desc":"只能在重庆使用",
     * "rcc_image":"a.gif",
     * "rcc_refund":"1(可退)/-1(不可退)"
     * }
     */
    private String card_expands;


    /**
     * 线下显示使用
     * 券种类型，加1000000
     */
    private String discount_type;

    /**
     * 线下显示使用
     * 券种名称
     */
    private String discount_name;

    /**
     * 线下显示使用
     * 优惠值类型（优惠类型 1：时间 2：折扣值 3：现金 4：次数）
     */
    private String discount_key;

    /**
     * 线下显示使用
     * 优惠值
     */
    private String discount_value;

    /**
     * 线下显示使用
     * 发行方id
     */
    private String mch_id;

    /**
     * 线下显示使用
     * 发行方名称
     */
    private String mch_name;

    /**
     * 查询第几页
     */
    private int page;

    /**
     * 每页多少条
     */
    private int rows;

    /**
     * 是否可叠加(0否，1是)
     */
    private int is_superposition;

    /**
     * 发放方式(0二维码发放，1活动发放)
     */
    private String release_type;

    /**
     * 卡券扩展限制信息
     */
    private JSONObject rcc_extends_limits;

    /**
     * 订单绑定的订单号
     */
    private String locked_order_code;
    /**
     * 订单锁定截止时间
     */
    private int order_locked_state;
    /**
     * 用户ID集合
     */
    private List<String> rcci_user_ids;


    public String getDiscount_code() {
        return discount_code;
    }

    public void setDiscount_code(String discount_code) {
        this.discount_code = discount_code;
    }

    public String getRspc_seller_id() {
        return rspc_seller_id;
    }

    public void setRspc_seller_id(String rspc_seller_id) {
        this.rspc_seller_id = rspc_seller_id;
    }

    public String getRspc_seller_type() {
        return rspc_seller_type;
    }

    public void setRspc_seller_type(String rspc_seller_type) {
        this.rspc_seller_type = rspc_seller_type;
    }

    public String getRspc_market_id() {
        return rspc_market_id;
    }

    public void setRspc_market_id(String rspc_market_id) {
        this.rspc_market_id = rspc_market_id;
    }

    public String getRcci_create_time() {
        return rcci_create_time;
    }

    public void setRcci_create_time(String rcci_create_time) {
        this.rcci_create_time = rcci_create_time;
    }

    public String getRcci_limit_starttime() {
        return rcci_limit_starttime;
    }

    public void setRcci_limit_starttime(String rcci_limit_starttime) {
        this.rcci_limit_starttime = rcci_limit_starttime;
    }

    public String getRcci_limit_endtime() {
        return rcci_limit_endtime;
    }

    public void setRcci_limit_endtime(String rcci_limit_endtime) {
        this.rcci_limit_endtime = rcci_limit_endtime;
    }

    public String getRcci_user_id() {
        return rcci_user_id;
    }

    public void setRcci_user_id(String rcci_user_id) {
        this.rcci_user_id = rcci_user_id;
    }

    public String getCard_id() {
        return card_id;
    }

    public void setCard_id(String card_id) {
        this.card_id = card_id;
    }

    public String getRcci_state() {
        return rcci_state;
    }

    public void setRcci_state(String rcci_state) {
        this.rcci_state = rcci_state;
    }

    public String getRcci_change_time() {
        return rcci_change_time;
    }

    public void setRcci_change_time(String rcci_change_time) {
        this.rcci_change_time = rcci_change_time;
    }

    public int getRcci_num() {
        return rcci_num;
    }

    public void setRcci_num(int rcci_num) {
        this.rcci_num = rcci_num;
    }

    public String getServer_type() {
        return server_type;
    }

    public void setServer_type(String server_type) {
        this.server_type = server_type;
    }

    public String getCard_type() {
        return card_type;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public String getStop_type() {
        return stop_type;
    }

    public void setStop_type(String stop_type) {
        this.stop_type = stop_type;
    }

    public String getRcci_salesman_id() {
        return rcci_salesman_id;
    }

    public void setRcci_salesman_id(String rcci_salesman_id) {
        this.rcci_salesman_id = rcci_salesman_id;
    }

    public String getRcci_lock_time() {
        return rcci_lock_time;
    }

    public void setRcci_lock_time(String rcci_lock_time) {
        this.rcci_lock_time = rcci_lock_time;
    }

    public String getRcci_transaction_id() {
        return rcci_transaction_id;
    }

    public void setRcci_transaction_id(String rcci_transaction_id) {
        this.rcci_transaction_id = rcci_transaction_id;
    }

    public String getCard_name() {
        return card_name;
    }

    public void setCard_name(String card_name) {
        this.card_name = card_name;
    }

    public String getCard_limit_range() {
        return card_limit_range;
    }

    public void setCard_limit_range(String card_limit_range) {
        this.card_limit_range = card_limit_range;
    }

    public String getCard_expands() {
        return card_expands;
    }

    public void setCard_expands(String card_expands) {
        this.card_expands = card_expands;
    }

    public String getRcci_long_plate() {
        return rcci_long_plate;
    }

    public void setRcci_long_plate(String rcci_long_plate) {
        this.rcci_long_plate = rcci_long_plate;
    }

    public String getRcci_kind() {
        return rcci_kind;
    }

    public void setRcci_kind(String rcci_kind) {
        this.rcci_kind = rcci_kind;
    }

    public String getDiscount_type() {
        return discount_type;
    }

    public void setDiscount_type(String discount_type) {
        this.discount_type = discount_type;
    }

    public String getDiscount_name() {
        return discount_name;
    }

    public void setDiscount_name(String discount_name) {
        this.discount_name = discount_name;
    }

    public String getDiscount_key() {
        return discount_key;
    }

    public void setDiscount_key(String discount_key) {
        this.discount_key = discount_key;
    }

    public String getDiscount_value() {
        return discount_value;
    }

    public void setDiscount_value(String discount_value) {
        this.discount_value = discount_value;
    }

    public String getMch_id() {
        return mch_id;
    }

    public void setMch_id(String mch_id) {
        this.mch_id = mch_id;
    }

    public String getMch_name() {
        return mch_name;
    }

    public void setMch_name(String mch_name) {
        this.mch_name = mch_name;
    }

    public int getIs_superposition() {
        return is_superposition;
    }

    public void setIs_superposition(int is_superposition) {
        this.is_superposition = is_superposition;
    }

    public String getRelease_type() {
        return release_type;
    }

    public void setRelease_type(String release_type) {
        this.release_type = release_type;
    }

    public JSONObject getRcc_extends_limits() {
        return rcc_extends_limits;
    }

    public void setRcc_extends_limits(JSONObject rcc_extends_limits) {
        this.rcc_extends_limits = rcc_extends_limits;
    }

    public List<String> getRcci_user_ids() {
        return rcci_user_ids;
    }

    public void setRcci_user_ids(List<String> rcci_user_ids) {
        this.rcci_user_ids = rcci_user_ids;
    }

    public Boolean getPlate_lock_state() {
        return plate_lock_state;
    }

    public void setPlate_lock_state(Boolean plate_lock_state) {
        this.plate_lock_state = plate_lock_state;
    }

    public String getLocked_plate() {
        return locked_plate;
    }

    public void setLocked_plate(String locked_plate) {
        this.locked_plate = locked_plate;
    }

    public String getLocked_order_code() {
        return locked_order_code;
    }

    public void setLocked_order_code(String locked_order_code) {
        this.locked_order_code = locked_order_code;
    }

    public int getOrder_locked_state() {
        return order_locked_state;
    }

    public void setOrder_locked_state(int order_locked_state) {
        this.order_locked_state = order_locked_state;
    }

    public List<String> getCard_id_list() {
        return card_id_list;
    }

    public void setCard_id_list(List<String> card_id_list) {
        this.card_id_list = card_id_list;
    }

}

