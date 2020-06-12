package com.czz.spring.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czz.spring.entity.CarVo;
import com.czz.spring.entity.Course;
import com.czz.spring.mapper.CourseMapper;
import com.czz.spring.service.CarService;
import com.czz.spring.service.CourseService;
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
public class CourseServiceImpl extends ServiceImpl<CourseMapper, Course> implements CourseService {
    public static int k = 0;
    @Resource
    private CarService carService;

    @Override
    public boolean pdkc() {
        System.out.println("我走着了！！！！！");
        List<CarVo> getlist = carService.getlist();
        for (CarVo i : getlist) {
            QueryWrapper<Course> qw = new QueryWrapper<>();
            qw.eq("id", i.getId());
            Course one = getOne(qw);
            if (one.getRepertory() - i.getNum() >= 0) {
                k = 1;
            } else {
                k = 0;
            }
        }
        if (k == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean gkc(Long id, Long num) {
        Course course = getById(id);
        course.setRepertory(course.getRepertory() - Integer.parseInt(num + ""));
        saveOrUpdate(course);
        return true;
    }
}
