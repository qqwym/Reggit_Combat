package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.reggit.demo.bean.Dish;
import com.reggit.demo.bean.DishFlavor;
import com.reggit.demo.bean.utilBean.DishDto;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.mapper.DishFlavorMapper;
import com.reggit.demo.mapper.DishMapper;
import com.reggit.demo.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;

@Transactional
@Service
public class DishServiceImpl extends ServiceImpl<DishMapper, Dish> implements DishService {

    @Autowired
    private DishMapper mapper;

    @Autowired
    private DishFlavorMapper dfmapper;

    @Override
    public R getPage(HttpServletRequest request, int page, int pageSize, String name) {
        return null;
    }

    @Override
    public R addDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavor, long id) {
        return null;
    }

    @Override
    public R editDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavors, long id) {
        return null;
    }

    @Override
    public R editStatus(HttpServletRequest request, List<Long> ids) {
        return null;
    }

    @Override
    public R editStatus1(HttpServletRequest request, List<Long> ids) {
        return null;
    }

    @Override
    public R delete(HttpServletRequest request, List<Long> ids) {
        return null;
    }

    @Override
    public R getList(long id, HttpServletRequest request, long status) {
        return null;
    }


}
