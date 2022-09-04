package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reggit.demo.bean.Orders;
import com.reggit.demo.bean.User;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.mapper.OrdersMapper;
import com.reggit.demo.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Transactional
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private OrdersMapper mapper;

    @Override
    public R getPage(HttpServletRequest request, int page, int pageSize, String name) {
        return null;
    }

    @Override
    public PageDto<Orders> getUserPage(int page, int pageSize, User user) {
        return null;
    }
}
