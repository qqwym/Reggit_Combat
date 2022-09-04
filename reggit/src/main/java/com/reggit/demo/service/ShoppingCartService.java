package com.reggit.demo.service;




import com.reggit.demo.bean.ShoppingCart;
import com.reggit.demo.bean.User;

import java.util.List;

public interface ShoppingCartService {

    /**
     * 加入购物车
     * @param shoppingCart
     * @return
     */
    ShoppingCart add(ShoppingCart shoppingCart);

    /**
     * 查询指定用户的购物车数据
     * @return
     */
    List<ShoppingCart> list();

    /**
     * 清空购物车
     * @return
     */
    int clean();

    int reduce(ShoppingCart shoppingCart, User id);

}
