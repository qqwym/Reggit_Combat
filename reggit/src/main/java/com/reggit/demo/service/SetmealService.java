package com.reggit.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.Setmeal;
import com.reggit.demo.bean.SetmealDish;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.bean.utilBean.SetmealDto;
import com.reggit.demo.common.R;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

public interface SetmealService extends IService<Setmeal> {

    R getPage(HttpServletRequest request, int page, int pageSize, String name);

    R addSetmeal(HttpServletRequest request, Setmeal setmeal, List<SetmealDish> setmealDish, long id);

    R getSetmeal(HttpServletRequest request, long id);

    R editSetmeal(HttpServletRequest request, List<SetmealDish> setmealDishes, Setmeal setmeal, long id);

    R editStatus(HttpServletRequest request, List<Long> id);

    R editStatus1(HttpServletRequest request, List<Long> id);

    R<Integer> delete(HttpServletRequest request, List<Long> id);

}
