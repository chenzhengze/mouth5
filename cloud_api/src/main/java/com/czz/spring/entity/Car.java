package com.czz.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p>
 *
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@TableName("t_car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 购物车id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    @TableField("num")
    private Long num;
    /**
     * 商品id
     */
    @TableField("cid")
    private Long cid;

    @TableField("uid")
    private Long uid;

}
