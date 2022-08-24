package com.tribble.tribblemybatis.service.impl;

import com.alibaba.fastjson.JSON;
import com.tribble.tribblemybatis.dao.CardParkRelDao;
import com.tribble.tribblemybatis.entity.po.CardParkRelBo;
import com.tribble.tribblemybatis.entity.po.CouponsBo;
import com.tribble.tribblemybatis.entity.vo.CouponsCarParkLimitVo;
import com.tribble.tribblemybatis.service.CardParkRelService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.*;

/**
 * 卡券与车场对应关系
 *
 * @author lifan
 * @since 2022/8/9 2:10 PM
 */
@Service
@Transactional(rollbackFor = Exception.class)
public class CardParkServiceImpl implements CardParkRelService {

    private final CardParkRelDao cardParkRelDao;


    @Autowired
    public CardParkServiceImpl(CardParkRelDao cardParkRelDao) {
        this.cardParkRelDao = cardParkRelDao;
    }


    @Override
    public int saveCardParkRelFromCouponsBo(CouponsBo couponsBo) {
        // 检查参数
        if(null == couponsBo) {
            return 0;
        }
        String cardId = couponsBo.getCardId();
        String cardCode = couponsBo.getCardCode();
        String rccCarParkInfo = couponsBo.getRccCarParkInfo();
        if(null == cardId || null == cardCode || StringUtils.isBlank(rccCarParkInfo)) {
            return 0;
        }
        // 取出车场id集合
        List<CouponsCarParkLimitVo> rccCarParkInfos = JSON.parseArray(rccCarParkInfo, CouponsCarParkLimitVo.class);
        Set<String> carParkIdSet = new HashSet<>();
        for(CouponsCarParkLimitVo carParkLimitVo : rccCarParkInfos) {
            String carParkId = carParkLimitVo.getRccCarParkId();
            if(StringUtils.isNotBlank(carParkId)) {
                carParkIdSet.add(carParkId.trim());
            }
        }
        if(CollectionUtils.isEmpty(carParkIdSet)) {
            return 0;
        }
        // 批量保存
        List<CardParkRelBo> cardParkRelBoList = new ArrayList<>();
        for(String carParkId : carParkIdSet) {
            cardParkRelBoList.add(new CardParkRelBo(cardId, cardCode, carParkId));
        }
        return cardParkRelDao.savaBatch(cardParkRelBoList);
    }


    @Override
    public List<CardParkRelBo> findByParkIds(List<String> parkIdList) {
        return CollectionUtils.isEmpty(parkIdList)
                ? Collections.emptyList()
                : cardParkRelDao.findByParkIds(parkIdList);
    }

    @Override
    public List<String> findCardIdsByParkIds(List<String> parkIdList) {
        return CollectionUtils.isEmpty(parkIdList)
                ? Collections.emptyList()
                : cardParkRelDao.findCardIdsByParkIds(parkIdList);
    }
}
