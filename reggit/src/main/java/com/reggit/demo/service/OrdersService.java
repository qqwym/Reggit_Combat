package com.reggit.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.Orders;
import com.reggit.demo.bean.User;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;


import javax.servlet.http.HttpServletRequest;

public interface OrdersService extends IService<Orders> {
    R getPage(HttpServletRequest request, int page, int pageSize, String name);

    PageDto<Orders> getUserPage(int page, int pageSize, User user);
}
