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
@TableName("t_order_detail")
public class OrderDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单号
     */
    @TableField("ordernum")
    private String ordernum;

    /**
     * 课程id
     */
    @TableField("cid")
    private Long cid;

    /**
     * 单价
     */
    @TableField("price")
    private BigDecimal price;

    /**
     * 数量
     */
    @TableField("num")
    private Integer num;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "id=" + id +
                ", ordernum=" + ordernum +
                ", cid=" + cid +
                ", price=" + price +
                ", num=" + num +
                "}";
    }
}
