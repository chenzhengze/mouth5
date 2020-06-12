package com.czz.spring.controller;


import com.czz.spring.entity.Xq;
import com.czz.spring.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/xq")
    public List<Xq> xq() {
        return orderService.xq();
    }
}
