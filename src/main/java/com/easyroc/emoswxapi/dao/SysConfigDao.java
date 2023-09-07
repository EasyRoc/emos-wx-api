package com.easyroc.emoswxapi.dao;

import com.easyroc.emoswxapi.pojo.SysConfig;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysConfigDao {

    List<SysConfig> selectAllParam();
}