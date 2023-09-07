package com.easyroc.emoswxapi.dao;

import com.easyroc.emoswxapi.pojo.TbCheckin;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface TbCheckinDao {

    /**
     * 是否签到
     * @param param
     * @return
     */
    Integer haveCheckin(HashMap param);

}