package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.reggit.demo.bean.User;
import com.reggit.demo.mapper.UserMapper;
import com.reggit.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
    @Autowired
    private UserMapper mapper;

    @Override
    public User findUser(String phone) {
        return null;
    }

    @Override
    public int addUser(User user) {
        return 0;
    }
}
