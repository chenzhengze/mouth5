package com.czz.spring.controller;


import com.czz.spring.entity.Course;
import com.czz.spring.service.CourseService;
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
@RequestMapping("/course")
public class CourseController {
    @Resource
    private CourseService courseService;

    @GetMapping("/list")
    public List<Course> list() {
        return courseService.list();
    }

    @GetMapping("/pdkc")
    public boolean pdkc() {
        return courseService.pdkc();
    }

    @PostMapping("/gkc")
    public boolean gkc(@RequestParam("id") Long id, @RequestParam("num") Long num) {
        return courseService.gkc(id, num);
    }
}
