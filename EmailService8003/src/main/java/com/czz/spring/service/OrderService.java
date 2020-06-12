package com.czz.spring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czz.spring.entity.Order;
import com.czz.spring.entity.Xq;

import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
public interface OrderService extends IService<Order> {


    List<Xq> xq();
}
