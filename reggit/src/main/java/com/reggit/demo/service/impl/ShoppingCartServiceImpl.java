package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.reggit.demo.bean.ShoppingCart;
import com.reggit.demo.bean.User;
import com.reggit.demo.bean.util.BaseContext;
import com.reggit.demo.mapper.ShoppingCartMapper;
import com.reggit.demo.service.ShoppingCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Transactional
public class ShoppingCartServiceImpl implements ShoppingCartService {

    @Autowired
    private ShoppingCartMapper shoppingCartMapper;

    /**
     * 加入购物车
     *   1. 加入购物车其实也是一个添加的动作，但是不能直接认为添加就完事了。
     *   2. 添加之前，先查询购物车有没有这件菜品|套餐
     *      2.1 按照user_id 和 dish_id | setmeal_id 来查询。
     *      2.2 如果查询出来，有数据，那么就执行更新操作。
     *          a. 就更新数量即可。 让原有的数量 + 1
     *      2.3 如果没有查询出来，那么表示这是第一次添加的数据
     *          a. 设置数量是 1.
     *
     * @param shoppingCart
     * @return
     */
    @Override
    public ShoppingCart add(ShoppingCart shoppingCart) {  // 张三 ， 红烧肉
        return null;


    }

    /**
     * 查询指定用户的购物车数据
     *
     * @return
     */
    @Override
    public List<ShoppingCart> list() {
        return null;
    }

    /**
     * 清空购物车
     *
     * @return
     */
    @Override
    public int clean() {
        return 0;
    }

    @Override
    public int reduce(ShoppingCart shoppingCart, User id) {
        return 0;
    }
}
