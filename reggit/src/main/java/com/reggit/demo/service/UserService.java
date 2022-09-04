package com.reggit.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.User;


public interface UserService extends IService<User> {

    User findUser(String phone);

    int addUser(User user);

}
