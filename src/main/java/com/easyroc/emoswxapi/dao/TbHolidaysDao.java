package com.easyroc.emoswxapi.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbHolidaysDao {

    /**
     * 查询当天是否为休息日
     * @return
     */
    Integer searchTodayIsHolidays();
}