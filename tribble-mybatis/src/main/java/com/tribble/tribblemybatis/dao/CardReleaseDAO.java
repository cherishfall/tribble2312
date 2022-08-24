package com.tribble.tribblemybatis.dao;

import com.tribble.tribblemybatis.entity.vo.CardReleaseVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author lifan
 * @since 2022/8/11 2:31 PM
 */
//@Mapper
public interface CardReleaseDAO {
    /**
     * 根据条件查询总数量
     *
     * @param cardReleaseVo
     * @return
     */
    int getCountWithCardIdList(CardReleaseVo cardReleaseVo);

    /**
     * 用户发放卡券
     * @param cardReleaseVo
     * @return
     */
    List<CardReleaseVo> queryCardListWithCardIdList(CardReleaseVo cardReleaseVo);

}

