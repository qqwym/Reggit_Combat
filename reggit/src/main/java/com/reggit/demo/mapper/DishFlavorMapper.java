package com.reggit.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggit.demo.bean.DishFlavor;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface DishFlavorMapper extends BaseMapper<DishFlavor> {

    int addDishFlavor(@Param("dishF") DishFlavor dishFlavor, @Param("id") long id);

    int editDishFlavor(@Param("dishF")DishFlavor dishFlavor,@Param("id")long id);

    List<DishFlavor> getDF(long id);
}
