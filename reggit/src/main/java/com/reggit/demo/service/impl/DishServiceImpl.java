package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.bean.Dish;
import com.itheima.reggie.bean.DishFlavor;
import com.itheima.reggie.bean.utilBean.DishDto;
import com.itheima.reggie.bean.utilBean.PageDto;
import com.itheima.reggie.common.R;
import com.itheima.reggie.mapper.DishFlavorMapper;
import com.itheima.reggie.mapper.DishMapper;
import com.itheima.reggie.service.DishService;
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
    public R<PageDto<DishDto>> getPage(HttpServletRequest request, int page, int pageSize, String name) {
        int setoff = (page-1)*pageSize;
        List<DishDto> dish = mapper.getPage(setoff,pageSize,name);
        int total = mapper.getTotal(name);
        PageDto<DishDto> page1 = new PageDto<>(dish,total);
        return R.success(page1);
    }

    @Override
    public R<Integer> addDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavor, long id) {
        Random random = new Random();
        dish.setUpdateTime(LocalDateTime.now());
        dish.setCreateTime(LocalDateTime.now());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        long id1 = Long.parseLong(dateTimeFormatter.format(LocalDateTime.now()));
        dish.setId(id1);
        int i = mapper.addDish(dish,id);
        int r = 1;
        if (dishFlavor==null){
            if (i>0){
                return R.success(1);
            }
        }else {
            for (DishFlavor flavor : dishFlavor) {
                flavor.setId(id1+ random.nextInt(10));
                flavor.setUpdateTime(LocalDateTime.now());
                flavor.setDishId(dish.getId());
                flavor.setIsDeleted(0);
                r = dfmapper.editDishFlavor(flavor,id);
            }
        }
        if (i>0&&r>0){
            return R.success(1);
        }
        return R.error("错误");
    }

    @Override
    public R<Integer> editDish(HttpServletRequest request, Dish dish, List<DishFlavor> dishFlavors, long id) {
        Random random = new Random();
        dish.setUpdateTime(LocalDateTime.now());
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
        long id1 = Long.parseLong(dateTimeFormatter.format(LocalDateTime.now()));
        dish.setId(id1);
        int i = mapper.editDish(dish,id);
        int r = 1;
        if (dishFlavors==null){
            if (i>0){
                return R.success(1);
            }
        }else {
            for (DishFlavor flavor : dishFlavors) {
                flavor.setId(id1+ random.nextInt(10));
                flavor.setUpdateTime(LocalDateTime.now());
                flavor.setDishId(dish.getId());
                flavor.setIsDeleted(0);
                r = dfmapper.editDishFlavor(flavor,id);
            }
        }
        if (i>0&&r>0){
            return R.success(1);
        }
        return R.success(0);
    }

    @Override
    public R<Integer> editStatus(HttpServletRequest request, List<Long> ids) {
        int i = 0;
        for (Long id : ids) {
             i += mapper.editStatus(id);
        }
        if (i>0){
            return R.success(i);
        }
        return R.error("0");
    }

    @Override
    public R<Integer> editStatus1(HttpServletRequest request, List<Long> ids) {
        int i = 0;
        for (Long id : ids) {
            i += mapper.editStatus1(id);
        }
        if (i>0){
            return R.success(i);
        }
        return R.error("0");
    }

    @Override
    public R<Integer> delete(HttpServletRequest request, List<Long> ids) {
        int i = 0;
        for (Long id : ids) {
            dfmapper.deleteById(id);
            i += mapper.deleteId(id);
        }
        if (i>0){
            return R.success(i);
        }
        return R.error("0");
    }

    @Override
    public R<List<DishDto>> getList(long id, HttpServletRequest request, long status) {
        List<DishDto> list = mapper.getList(id,status);
        for (DishDto dto : list) {
            dto.setFlavors(dfmapper.getDF(dto.getId()));
        }
        return R.success(list);
    }


}
