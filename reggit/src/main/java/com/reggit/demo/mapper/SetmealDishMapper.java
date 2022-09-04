package com.reggit.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggit.demo.bean.SetmealDish;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
@Repository
public interface SetmealDishMapper extends BaseMapper<SetmealDish> {
    int addSetmealDish(@Param("setmealDish") SetmealDish setmealDish, @Param("id") long id);
    List<SetmealDish> getList(long id);
    int deleteBysetmealId(long id);
}
