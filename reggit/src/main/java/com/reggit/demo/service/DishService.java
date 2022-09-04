package com.reggit.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.Dish;
import com.reggit.demo.bean.DishFlavor;
import com.reggit.demo.bean.utilBean.DishDto;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface DishService extends IService<Dish> {

    R getPage(HttpServletRequest request, int page, int pageSize, String name);

    R addDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavor, long id);

    R editDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavors, long id);

    R editStatus(HttpServletRequest request, List<Long> id);

    R editStatus1(HttpServletRequest request, List<Long> id);

    R delete(HttpServletRequest request, List<Long> id);

    R<List<DishDto>> getList(long id, HttpServletRequest request, long status);

}
