package com.easyroc.emoswxapi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 模块资源表
 * tb_module
 */
@Data
public class TbModule implements Serializable {
    private Integer id;

    private String moduleCode;

    private String moduleName;

    private static final long serialVersionUID = 1L;
}