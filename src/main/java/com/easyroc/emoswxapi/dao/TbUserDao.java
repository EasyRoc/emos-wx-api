package com.easyroc.emoswxapi.dao;

import com.easyroc.emoswxapi.pojo.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.shiro.crypto.hash.Hash;

import java.util.HashMap;
import java.util.Set;

@Mapper
public interface TbUserDao {

    /**
     * 是否存在超级管理员
     *
     * @return
     */
    boolean haveRootUser();

    /**
     * 保存用户记录
     * @param param
     * @return
     */
    int insert(HashMap param);

    /**
     * 查询用户id
     * @param openId
     * @return
     */
    Integer searchIdByOpenId(String openId);

    /**
     * 获取用户权限
     * @param userId
     * @return
     */
    Set<String> searchUserPermissions(int userId);


}