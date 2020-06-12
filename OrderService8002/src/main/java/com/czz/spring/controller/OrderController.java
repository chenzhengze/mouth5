package com.czz.spring.controller;


import com.czz.spring.entity.CommonResult;
import com.czz.spring.entity.Xq;
import com.czz.spring.service.OrderService;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/jiesuan")
    public CommonResult jiesuan(@RequestParam("sum") Long sum, @RequestParam("uid") Long uid) {
        return orderService.jiesuam(sum, uid);
    }

    @GetMapping("/xq")
    public List<Xq> xq() {
        return orderService.xq();
    }
}
