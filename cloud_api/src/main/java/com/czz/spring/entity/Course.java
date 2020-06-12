package com.czz.spring.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 *
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@TableName("t_course")
public class Course implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 课程id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 课程名称
     */
    @TableField("name")
    private String name;

    /**
     * 单价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 库存
     */
    @TableField("repertory")
    private Integer repertory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getRepertory() {
        return repertory;
    }

    public void setRepertory(Integer repertory) {
        this.repertory = repertory;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name=" + name +
                ", price=" + price +
                ", repertory=" + repertory +
                "}";
    }
}
