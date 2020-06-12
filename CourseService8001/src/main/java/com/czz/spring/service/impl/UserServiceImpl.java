package com.czz.spring.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.czz.spring.entity.User;
import com.czz.spring.mapper.UserMapper;
import com.czz.spring.service.UserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZT
 * @since 2020-06-10
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
