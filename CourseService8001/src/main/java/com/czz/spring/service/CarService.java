package com.czz.spring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czz.spring.entity.Car;
import com.czz.spring.entity.CarVo;
import com.czz.spring.entity.CommonResult;
import com.czz.spring.entity.Course;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
public interface CarService extends IService<Car> {

    CommonResult add(Long uid, Course course);

    List<CarVo> getlist();

    CommonResult xgnum(CarVo carVo);

    CommonResult del(CarVo carVo);

    boolean delids(ArrayList<Long> ids);
}
