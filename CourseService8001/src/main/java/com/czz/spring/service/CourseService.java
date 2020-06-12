package com.czz.spring.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.czz.spring.entity.Course;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
public interface CourseService extends IService<Course> {

    boolean pdkc();

    boolean gkc(Long id, Long num);
}
