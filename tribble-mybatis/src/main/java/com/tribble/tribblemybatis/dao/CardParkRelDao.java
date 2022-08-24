package com.tribble.tribblemybatis.dao;

import com.tribble.tribblemybatis.entity.po.CardParkRelBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * card_park_rel 表 dao
 *
 * @author lifan
 * @since 2022/8/9 10:49 AM
 */
@Mapper
public interface CardParkRelDao {
    /**
     * 保存 CardParkRelBo
     * @param cardParkRelBo not null
     * @return 受影响行数
     * */
    int save(CardParkRelBo cardParkRelBo);

    /**
     * 批量保存 CardParkRelBo
     * @param cardParkRelBoList not empty
     * @return 受影响行数
     * */
    int savaBatch(@Param("cardParkRelBoList") List<CardParkRelBo> cardParkRelBoList);

    /**
     * 根据车场id列表查询卡劵和可使用车场关系列表
     * @param parkIds 车场id列表，not empty
     * @return 卡劵和可使用车场关系列表
     * */
    List<CardParkRelBo> findByParkIds(@Param("parkIds") List<String> parkIds);

    /**
     * 根据车场id列表查询卡券id列表
     * @param parkIds 车场id列表，not empty
     * @return 卡劵和可使用车场关系列表
     * */
    List<String> findCardIdsByParkIds(@Param("parkIds") List<String> parkIds);

}
