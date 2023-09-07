package com.easyroc.emoswxapi.config;

import cn.hutool.core.util.StrUtil;
import com.easyroc.emoswxapi.common.constants.SystemConstants;
import com.easyroc.emoswxapi.dao.SysConfigDao;
import com.easyroc.emoswxapi.pojo.SysConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.util.List;

@Component
@Slf4j
public class InitSystemContant {

    @Resource
    private SysConfigDao sysConfigDao;

    @Resource
    private SystemConstants constants;

    @PostConstruct
    public void init() {
        System.out.println("InitSystemContant init----");
        List<SysConfig> list = sysConfigDao.selectAllParam();
        list.forEach(one -> {
            String key = one.getParamKey();
            key = StrUtil.toCamelCase(key);
            String value = one.getParamValue();
            try {
                Field field = constants.getClass().getDeclaredField(key);
                field.set(constants, value);
            } catch (Exception e) {
                log.error("执行异常", e);
            }
        });

    }

}
