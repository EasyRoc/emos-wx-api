package com.easyroc.emoswxapi.service;

import com.easyroc.emoswxapi.pojo.TbUser;

import java.util.Set;

public interface UserService {

    /**
     * 注册用户
     *
     * @param registerCode
     * @param code
     * @param nickname
     * @param photo
     * @return
     */
    Integer registerUser(String registerCode, String code, String nickname, String photo);

    /**
     * 获取用户权限
     * @param userId
     * @return
     */
    Set<String> searchUserPermissions(int userId);


    /**
     * 登录
     * @param code
     * @return
     */
    Integer login(String code);

    TbUser searchById(int userId);


}
