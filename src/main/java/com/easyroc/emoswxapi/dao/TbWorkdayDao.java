package com.easyroc.emoswxapi.dao;

import com.easyroc.emoswxapi.pojo.TbWorkday;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbWorkdayDao {

    /**
     * 查询当天是否为工作日
     * @return
     */
    Integer searchTodayIsWorkday();
}