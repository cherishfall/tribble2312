package com.tribble.tribblemybatis.constants;

import java.math.BigDecimal;

/**
 * Class Name: BusinessConstants<br>
 * Description: 业务常量
 * 
 * @author lilin
 * @version 1.0
 */
public class BusinessConstants {

    // -- common --

    // MD5加盐
    public final static String MD5_SALT_VALUE = "!@#$%qwert";
    // 老系统MD5加盐前缀
    public final static String MD5_SALT_OLD_PRE = "&*()";
    // 老系统MD5加盐前缀
    public final static String MD5_SALT_OLD_SUF = "!@#$%^";
    // 邮件激活码分隔符
    public final static String SEPARATE_EMAIL_CODE = "@";
    // 通用消息变量名
    public final static String MODEL_KEY_MESSAGE = "_message";
    // 通用消息状态变量名
    public final static String MODEL_KEY_MESSAGE_STATUS = "_message_status";
    // 通用消息类型变量名
    public final static String MODEL_KEY_MESSAGE_TYPE = "_message_type";

    // -- loan --

    // 首页发标预告排序字段
    public final static String LOAN_NOTICE_ORDER_INDEX_PAGE = "orderLoanNoticeView";

    // 投资列表默认缓存条数
    public final static Integer LOAN_DEFAULT_CACHE_NUM = 12;
    // 首页推荐项目列表展示条数
    public final static Integer LOAN_DISP_NUM_INDEX_PAGE = 6;
    // 首页债权转让列表展示条数
    public final static Integer LOAN_TRANSFER_DISP_NUM_INDEX_PAGE = 3;
    // 我要投资列表展示条数
    public final static Integer LOAN_DISP_NUM_INVEST_PAGE = LOAN_DEFAULT_CACHE_NUM;
    // 首页借款列表排序方式
    public final static String LOAN_ORDER_INDEX_PAGE = "orderLoanTender";
    // 借款列表前台可展示状态类型
    public final static String LOAN_STSTUS_TYPE_VIEW = "view";
    // 借款列表前台可投状态类型
    public final static String LOAN_STSTUS_TYPE_TENDER = "tender";

    // 线上标的还款状态类型-未还款
    public final static String LOAN_REPAYMENT_STATUS_TYPE_WAIT = "wait";
    // 线上标的还款状态类型-已还款
    public final static String LOAN_REPAYMENT_STATUS_TYPE_REPAID = "repaid";

    // 线上标的收款状态类型-未收款
    public final static String LOAN_COLLECTION_STATUS_TYPE_WAIT = "wait";
    // 线上标的收款状态类型-已收款
    public final static String LOAN_COLLECTION_STATUS_TYPE_COLLED = "colled";
    // 债转最低投标额
    public final static BigDecimal LOAN_RIGHT_TRANSFER_LOWEST_TENDER = new BigDecimal(50);

    // 投标协议请求头的键名
    public final static String LOAN_CONTRACT_REQUEST_HEADER_KEY_ACCESSKEY = "accessKey";

    // -- stat --

    // 首页用户投资排行展示条数
    public final static Integer STAT_USER_DISP_NUM_INDEX_PAGE = 5;
    // 首页用户投资排行排序字段
    public final static String STAT_USER_ORDER_INDEX_PAGE = "orderStatUserInvestInvest";
    // 透明理财列表展示条数
    public final static Integer STAT_CLARITY_DISP_NUM_INDEX_PAGE = 4;
 
    // -- sys --

    // 代表系统的id
    public final static Integer SYS_USER_ID = 0;

    // -- social --

    // QQ社交 应用权限
    public final static String SOCIAL_QQ_OAUTH_SCOPE = "get_user_info,add_topic,add_one_blog,add_album,upload_pic,list_album,add_share,check_page_fans,add_t,add_pic_t,del_t,get_repost_list,get_info,get_other_info,get_fanslist,get_idollist,add_idol,del_ido,get_tenpay_addr";

    // -- wallet --

    // 充值列表排序
    public final static String WALLET_RECHARGE_ORDER_BY_ID_DESC = "id";
    // 提现列表排序
    public final static String WALLET_CASH_ORDER_BY_ID_DESC = "id";
    // 提现最大金额
    public final static BigDecimal WALLET_CASH_MAX_MONEY = new BigDecimal(50000);
    // 提现最小金额
    public final static BigDecimal WALLET_CASH_MIN_MONEY = new BigDecimal(100);

    // -- user --

    // 用户头像
    public final static Integer[] USER_AVATAR_BIG = { 100, 100 };
    public final static Integer[] USER_AVATAR_MIDDLE = { 50, 50 };
    public final static Integer[] USER_AVATAR_SMALL = { 30, 30 };

    // -- sysFile --

    // 默认文件最大上传大小2M
    public final static long SYS_FILE_SIZE_MAX = 2097152;
    // 头像文件最大上传大小5M（flash剪切上传后的图像大于原图2倍）
    public final static long SYS_FILE_SIZE_AVATAR_MAX = 5242880;

    // 水印默认位置（上左下右中5个点）
    public final static String SYS_FILE_WATERMARK_POSITION = "10";

    /*
     * =================================通用常量数据================================
     */
    public final static String CONSTANTS_STRING_NULL = "";
    public final static String CONSTANTS_CHARACTER_ENCODING = "utf-8";
    public final static String CONSTANTS_BOOLEAN_TRUE = "true";
    public final static String CONSTANTS_BOOLEAN_FALSE = "false";
    public final static String CONSTANTS_STRING_TRUE = "T";
    public final static String CONSTANTS_STRING_FALSE = "F";
    public final static int CONSTANTS_DFAULT_PAGEINDEX = 1;
    public final static int CONSTANTS_DFAULT_PAGESIZE = 20;
    public final static String CONSTANTS_STRING_POINT = ".";
    public final static String CONSTANTS_USER_ID = "userId";
    public final static String CONSTANTS_ENCODE_KEY = "A1B2CZD4C5F60GR8";
    public final static String CONSTANTS_FILE_SPLID = "/";
    public final static String CONSTANTS_STRING_SPLID = ",";
    public final static String CONSTANTS_UPLOAD_DIR = "static/upload/icons/";
    public final static String CONSTANTS_DEFAULT_PICTYPE = ".png";
    public final static String CONSTANTS_STRING_ZERO = "0";
    public final static String CONSTANTS_STRING_ONE = "1";
    public final static String CONSTANTS_STRING_TWO = "2";
    public final static String CONSTANTS_STRING_THREE = "3";
    
    // 跨域测试开放
    public final static String CONSTANTS_CHAR_STAR = "*";
    public final static String ACCESS_CONTROL_ALLOW_ORIGIN = "Access-Control-Allow-Origin";

    /*
     * ===============================接口服务错误信息===============================
     */
    public final static String MSG_CODE_200 = "200";
    public final static String MSG_DSC_200 = "success!";
    public final static String MSG_CODE_201 = "201";
    public final static String MSG_DSC_201 = "empty data!";
    public final static String MSG_CODE_400 = "400";
    public final static String MSG_CODE_401 = "401";
    public final static String MSG_DSC_400 = "data error!";
    public final static String MSG_DSC_401 = "time error!";
    public final static String MSG_CODE_300 = "300";
    public final static String MSG_DSC_300 = "logic error!";
    public final static String MSG_CODE_301 ="301";
    public final static String MSG_DSC_301 = "name1 error!";
    public final static String MSG_CODE_302 ="302";
    public final static String MSG_DSC_302 = "name2 error!";
    public final static String MSG_CODE_303 ="303";
    public final static String MSG_DSC_303 = "phone error!";
    public final static String MSG_CODE_304 ="304";
    public final static String MSG_DSC_304 = "name3 error!";
    public final static String MSG_CODE_600 ="600";
    public final static String MSG_DSC_600 = "addError";
    public final static String MSG_CODE_601 ="601";
    public final static String MSG_DSC_601 = "parkId is empty";
    public final static String MSG_CODE_602 ="602";
    public final static String MSG_DSC_602 = "park id is repty";
    public final static String MSG_PHONE_ERROR = "电话号码重复!";
    /*
     * ===============================外部接口地址===============================
     */
    //测试环境
    public final static String IMP_CARPARK_ADDR="http://192.168.0.85:8080/carPark";//停车场接口
    public final static String IMP_COUPONS_ADDR="http://xbtest.parking24.cn:9090/rfcard";//优惠券设置接口(测试环境)
    public final static String IMP_SELLER_PART_CODE_ADD="http://xbtest.parking24.cn:9090/card"; //优惠券库存设置接口
    public final static String IMP_PAYMENT_ADD="http://xbtest.parking24.cn:9090/xbpaymentplatform/reformer/payment";//支付中心（测试地址）
    public final static String IMP_PAYMENT_RETURN_ADD="http://xbtest.parking24.cn/reformer-saas-business/returnUrlHtml5.do";//微信付款成功后回调此方法（业务区更改库存）
    public final static String IMP_ERWEIMA_ADD="http://xbtest.parking24.cn:9090/reformer-saas-business/static/html5/sendCard.html?token=";//生成发券二维码地址
    public final static String IMP_BAOBIAO_ADD="http://xbtest.parking24.cn:9090/reformer-park-calc";//交易记录报表接口
    
    /*
     * ===============================微信公众号支付配置===============================
     */
    //测试环境1376859702
    public final static String GZH_APPID_CODE="wxf43564a2c862075f";//公众号appid
    public final static String GZH_SHANGHU_CODE="1376859702";//公众号商户号
    public final static String GZH_SHANGHU_RON_CODE="";//公众号子商户
    public final static String GZH_SECRET_CODE="83495f9b6c116a514686198e5f9622c9";//公众号token密钥
    public final static String GZH_APAY_CODE="12345678123456781234567812345678";//公众号支付密钥
    
    /*
     * ===============================redis配置===============================
     */
    //用户redis配置(PST)
    public final static String USERREDIS_HOME="121.43.170.60";
    public final static String USERREDIS_PORT="6379";
    public final static String USERREDIS_TIMEOUT="10000";
    public final static String USERREDIS_PASSOWORD="eLkhq9tNkoqt0msmpuHDwgvGZ42RbA";
    public final static String USERREDIS_DATABASE="0";
    //卡券发放redis配置(PST)
    public final static String CARDREDIS_HOME="121.43.170.60";
    public final static String CARDREDIS_PORT="6379";
    public final static String CARDREDIS_TIMEOUT="10000";
    public final static String CARDREDIS_PASSOWORD="eLkhq9tNkoqt0msmpuHDwgvGZ42RbA";
    public final static String CARDREDIS_DATABASE="8";
    
    
    
//    /*
//     * ===============================外部接口地址(正式环境)===============================
//     */
//    //正式环境
//    public final static String IMP_CARPARK_ADDR="http://www.parking24.cn/carPark";//停车场接口
//    public final static String IMP_COUPONS_ADDR="http://www.parking24.cn/rfcard";//优惠券设置接口 
//    public final static String IMP_SELLER_PART_CODE_ADD="http://www.parking24.cn/card"; //优惠券库存设置接口
//    public final static String IMP_PAYMENT_ADD="http://www.parking24.cn/xbpaymentplatform/reformer/payment";//支付中心 
//    public final static String IMP_PAYMENT_RETURN_ADD="http://www.parking24.cn/reformer-saas-business/returnUrlHtml5.do";//微信付款成功后回调此方法（业务区更改库存）
//    public final static String IMP_ERWEIMA_ADD="http://www.parking24.cn/reformer-saas-business/static/html5/sendCard.html?token=";//生成发券二维码地址
//    public final static String IMP_BAOBIAO_ADD="http://www.parking24.cn/reformer-park-calc";//交易记录报表接口
//     
//    
//    
//    /*
//     * ===============================微信公众号支付配置(正式环境)===============================
//     */
//	public final static String GZH_APPID_CODE="wx24889d86935215d3";//公众号appid 
//	public final static String GZH_SHANGHU_CODE="1353249202";//公众号商户号
//	public final static String GZH_SHANGHU_RON_CODE="1377157902";//公众号子商户
//	public final static String GZH_SECRET_CODE="9fee3d65a1b7cd985e4002b43cb9fb64";//公众号token密钥
//	public final static String GZH_APAY_CODE="7pm8J2QloeMFvQo63P6LKomSJuksJuIQ";//公众号支付密钥
//       
//    
//    /*
//     * ===============================redis配置(正式环境)===============================
//     */
//    //用户redis配置(SERVER)
//    public final static String USERREDIS_HOME="f323bccad65f46fd.m.cnhza.kvstore.aliyuncs.com";
//    public final static String USERREDIS_PORT="6379";
//    public final static String USERREDIS_TIMEOUT="10000";
//    public final static String USERREDIS_PASSOWORD="jIu8u1idlsdiU832ajkdf82kas";
//    public final static String USERREDIS_DATABASE="0";
//    //卡券发放redis配置(SERVER)
//    public final static String CARDREDIS_HOME="dd4c7cd52dfa458a.m.cnhza.kvstore.aliyuncs.com";
//    public final static String CARDREDIS_PORT="6379";
//    public final static String CARDREDIS_TIMEOUT="10000";
//    public final static String CARDREDIS_PASSOWORD="eLkhq9tNkoqt0msmpuHDwgvGZ42RbA";
//    public final static String CARDREDIS_DATABASE="12";
    
    
}
