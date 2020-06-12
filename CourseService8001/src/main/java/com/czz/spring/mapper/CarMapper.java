package com.czz.spring.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.czz.spring.entity.Car;
import com.czz.spring.entity.CarVo;

import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
public interface CarMapper extends BaseMapper<Car> {

    List<CarVo> getlist();
}
