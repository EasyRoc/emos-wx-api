package com.easyroc.emoswxapi.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * 行为表
 * tb_action
 */
@Data
public class TbAction implements Serializable {
    private Integer id;

    private String actionCode;

    private String actionName;

    private static final long serialVersionUID = 1L;
}