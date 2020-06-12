package com.czz.spring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czz.spring.entity.Order;
import com.czz.spring.entity.Xq;
import com.czz.spring.mapper.OrderMapper;
import com.czz.spring.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Xq> xq() {
        return orderMapper.xq();
    }
}
