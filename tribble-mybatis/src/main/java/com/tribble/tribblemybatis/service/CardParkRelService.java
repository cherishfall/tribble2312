package com.tribble.tribblemybatis.service;



import com.tribble.tribblemybatis.entity.po.CardParkRelBo;
import com.tribble.tribblemybatis.entity.po.CouponsBo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * CardParkRelService
 *
 * @author lifan
 * @since 2022/8/9 2:10 PM
 */
public interface CardParkRelService {

    /**
     * 从卡券BO中保存卡劵车场关系
     * */
    int saveCardParkRelFromCouponsBo(CouponsBo couponsBo);


    /**
     * 根据车场id列表查询卡劵和车场对应关系
     * */
    List<CardParkRelBo> findByParkIds(List<String> parkIdList);

    /**
     * 根据车场id列表查询卡券id列表
     * @param parkIdList 车场id列表，not empty
     * @return 卡劵和可使用车场关系列表
     * */
    List<String> findCardIdsByParkIds(List<String> parkIdList);

}
