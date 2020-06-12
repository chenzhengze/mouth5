package com.czz.spring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czz.spring.entity.*;
import com.czz.spring.mapper.OrderMapper;
import com.czz.spring.service.CourseService;
import com.czz.spring.service.OrderDetailService;
import com.czz.spring.service.OrderService;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
    @Resource
    private CourseService courseService;
    @Resource
    private OrderDetailService orderDetailService;
    @Autowired(required = false)
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public CommonResult jiesuam(Long sum, Long uid) {
        List<CarVo> carlist = courseService.carlist();
        //判断库存
        System.out.println("我到这了！！！！！！！");
        boolean kc = courseService.pdkc();
        System.out.println(kc + "*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        if ((kc)) {
            Order order = new Order();
            order.setUid(uid);
            String uuid = UUID.randomUUID().toString();
            order.setOrdernum(uuid);
            order.setDate(new Date());
            BigDecimal sum1 = new BigDecimal(sum);
            order.setPricesum(sum1);
            boolean save = save(order);
            if (save) {
                ArrayList<Long> ids = new ArrayList<>();
                for (CarVo i : carlist) {
                    OrderDetail orderDetail = new OrderDetail();
                    orderDetail.setOrdernum(uuid);
                    orderDetail.setPrice(i.getPrice());
                    orderDetail.setNum(Integer.parseInt(i.getNum() + ""));
                    orderDetail.setCid(i.getId());
                    ids.add(i.getId());
                    orderDetailService.save(orderDetail);
                    courseService.gkc(i.getId(), i.getNum());
                }
                boolean del = courseService.del(ids);

                /*rocketMQTemplate.convertAndSend("czz","下单成功！");*/
                if (del) {
                    return new CommonResult(200, "OK");
                } else {
                    return new CommonResult(400, "ERRO");
                }

            } else {
                return new CommonResult(400, "ERRO");
            }
        } else {
            return new CommonResult(400, "ERRO");
        }
    }

    @Override
    public List<Xq> xq() {
        return orderMapper.xq();
    }
}
