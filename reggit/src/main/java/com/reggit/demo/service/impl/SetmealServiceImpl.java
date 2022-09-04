package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.reggit.demo.bean.Setmeal;
import com.reggit.demo.bean.SetmealDish;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.bean.utilBean.SetmealDto;
import com.reggit.demo.common.R;
import com.reggit.demo.mapper.SetmealDishMapper;
import com.reggit.demo.mapper.SetmealMapper;
import com.reggit.demo.service.SetmealService;
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
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal> implements SetmealService {

    @Autowired
    private SetmealMapper mapper;

    @Autowired
    private SetmealDishMapper dfmapper;


    @Override
    public R getPage(HttpServletRequest request, int page, int pageSize, String name) {
        return null;
    }

    @Override
    public R addSetmeal(HttpServletRequest request, Setmeal setmeal, List<SetmealDish> setmealDish, long id) {
        return null;
    }

    // RestFul 风格
    // 原始： localhost:8080/aaa/deleteStu?id=3
    // restful :  localhost:8080/aaa/stu/3
    // restful  搭配请求方式
            /*
                添加 ：  post
                查询：  get
                更新：  put
                删除 : delete
             */
    @Override
    public R getSetmeal(HttpServletRequest request, long id) {
        return null;
    }

    @Override
    public R editSetmeal(HttpServletRequest request, List<SetmealDish> setmealDishes, Setmeal setmeal, long id) {
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


}
