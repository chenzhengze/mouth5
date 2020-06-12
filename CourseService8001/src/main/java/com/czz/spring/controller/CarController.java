package com.czz.spring.controller;


import com.czz.spring.entity.CarVo;
import com.czz.spring.entity.CommonResult;
import com.czz.spring.entity.Course;
import com.czz.spring.service.CarService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
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
@RequestMapping("/car")
public class CarController {
    @Resource
    private CarService carService;

    @PostMapping("/add")
    public CommonResult add(@RequestParam("uid") Long uid, @RequestBody Course course) {
        return carService.add(uid, course);
    }

    @GetMapping("/list")
    public List<CarVo> carlist() {
        return carService.getlist();
    }

    @PostMapping("/xgnum")
    public CommonResult xgnum(@RequestBody CarVo carVo) {
        return carService.xgnum(carVo);
    }

    @PostMapping("/del")
    public CommonResult del(@RequestBody CarVo carVo) {
        return carService.del(carVo);
    }

    @PostMapping("/delids")
    public boolean del(@RequestBody ArrayList<Long> ids) {
        return carService.delids(ids);
    }
}
