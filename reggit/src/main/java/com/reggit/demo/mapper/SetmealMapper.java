package com.reggit.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggit.demo.bean.Setmeal;
import com.reggit.demo.bean.utilBean.SetmealDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface SetmealMapper extends BaseMapper<Setmeal> {

    //查询
    List<SetmealDto> getPage(@Param("setoff") int page, @Param("pageSize") int pageSize, @Param("name") String name, @Param("id")long id);

    //获取数量
    int getTotal(String name);

    int addSetmeal(@Param("setmeal") Setmeal setmeal,@Param("id") long id);

    int editSetmeal(@Param("setmeal") Setmeal setmeal,@Param("id") long id);

    int editStatus(long id);

    int editStatus1(long id);

}
