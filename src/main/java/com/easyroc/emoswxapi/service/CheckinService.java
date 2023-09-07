package com.easyroc.emoswxapi.service;

public interface CheckinService {

    /**
     * 查询是否可以签到
     * @param userId
     * @param date
     * @return
     */
    String validCanCheckIn(int userId, String date);
}
