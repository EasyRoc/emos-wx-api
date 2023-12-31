package com.easyroc.emoswxapi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 疫情城市列表
 * tb_city
 */
@Data
public class TbCity implements Serializable {
    private Integer id;

    private String city;

    private String code;

    private static final long serialVersionUID = 1L;
}