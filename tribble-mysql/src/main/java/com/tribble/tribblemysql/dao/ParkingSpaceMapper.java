package com.tribble.tribblemysql.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.tribble.tribblemysql.po.ParkingSpace;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 车位表 Mapper 接口
 * </p>
 *
 * @author wangzz
 * @since 2020-12-28
 */
@Mapper
public interface ParkingSpaceMapper extends BaseMapper<ParkingSpace> {



}
