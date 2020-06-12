package com.czz.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czz.spring.entity.Car;
import com.czz.spring.entity.CarVo;
import com.czz.spring.entity.CommonResult;
import com.czz.spring.entity.Course;
import com.czz.spring.mapper.CarMapper;
import com.czz.spring.service.CarService;
import com.czz.spring.service.CourseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@Service
public class CarServiceImpl extends ServiceImpl<CarMapper, Car> implements CarService {
    @Resource
    private CarMapper carMapper;

    @Resource
    private CourseService courseService;

    @Override
    public CommonResult add(Long uid, Course course) {
        QueryWrapper<Car> qw = new QueryWrapper<>();
        qw.eq("cid", course.getId());
        Car one = getOne(qw);
        if (Objects.nonNull(one)) {
            one.setNum(one.getNum() + 1);
            saveOrUpdate(one);
            return new CommonResult(200, "添加成功！");
        } else {
            Car car = new Car();
            car.setCid(course.getId());
            car.setUid(uid);
            car.setNum(1L);
            boolean save = save(car);
            if (save) {
                return new CommonResult(200, "添加成功！");
            } else {
                return new CommonResult(400, "添加失败！");
            }
        }

    }

    @Override
    public List<CarVo> getlist() {

        return carMapper.getlist();
    }

    @Override
    public CommonResult xgnum(CarVo carVo) {
        QueryWrapper<Car> qw = new QueryWrapper<>();
        qw.eq("cid", carVo.getId());
        Car one = getOne(qw);
        if (Objects.nonNull(one)) {
            one.setNum(carVo.getNum());
            saveOrUpdate(one);
            return new CommonResult(200, "SCUESS!");
        } else {
            return new CommonResult(400, "ERRO!");
        }
    }

    @Override
    public CommonResult del(CarVo carVo) {
        QueryWrapper<Car> qw = new QueryWrapper<>();
        qw.eq("cid", carVo.getId());
        boolean remove = remove(qw);
        if (remove) {
            return new CommonResult(200, "SCUESS！");
        } else {
            return new CommonResult(400, "ERRO！");
        }

    }

    @Override
    public boolean delids(ArrayList<Long> ids) {
        for (Long i : ids) {
            QueryWrapper<Car> qw = new QueryWrapper<>();
            qw.eq("cid", i);
            remove(qw);
        }
        return true;
    }

}
