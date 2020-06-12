package com.czz.spring.service;

import com.czz.spring.entity.CarVo;
import com.czz.spring.entity.Course;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Component
@FeignClient("nacos-course-provider")
public interface CourseService {
    @GetMapping("/course/list")
    public List<Course> list();


    @GetMapping("/car/list")
    public List<CarVo> carlist();

    @GetMapping("/course/pdkc")
    public boolean pdkc();

    @PostMapping("/car/delids")
    boolean del(@RequestBody ArrayList<Long> ids);

    @PostMapping("/course/gkc")
    boolean gkc(@RequestParam("id") Long id, @RequestParam("num") Long num);
}
