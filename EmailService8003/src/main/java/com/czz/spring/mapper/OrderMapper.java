package com.czz.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czz.spring.entity.Order;
import com.czz.spring.entity.Xq;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
public interface OrderMapper extends BaseMapper<Order> {

    List<Xq> xq();
}
