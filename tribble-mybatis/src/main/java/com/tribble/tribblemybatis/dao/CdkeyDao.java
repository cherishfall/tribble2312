package com.tribble.tribblemybatis.dao;

import com.tribble.tribblemybatis.entity.po.CdkeyBo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author lifan
 * @since 2022/8/10 7:31 PM
 */
@Mapper
public interface CdkeyDao {
    /**
     * 统计已转赠数量
     * @param createUserIds
     * @return
     */
    int countGiveReport(@Param("createUserIds") List<String> createUserIds,
                        @Param("carParkIdList") List<String> carParkIdList);

    /**
     * 查询已转赠记录
     * @param createUserIds
     * @param startWith
     * @param pageSize
     * @return
     */
    List<CdkeyBo> queryGiveReport(@Param("createUserIds")List<String> createUserIds,
                                  @Param("carParkIdList") List<String> carParkIdList,
                                  @Param("startWith")Integer startWith, @Param("pageSize")Integer pageSize);
}
