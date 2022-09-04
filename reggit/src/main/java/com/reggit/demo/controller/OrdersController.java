package com.reggit.demo.controller;


import com.reggit.demo.bean.Orders;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.service.OrdersService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Slf4j
@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/page")
    public R getPage(HttpServletRequest request){
        return null;
    }

    @GetMapping("/userPage")
    public R getUserPage(HttpServletRequest request, HttpSession session){
        return null;
    }


}
