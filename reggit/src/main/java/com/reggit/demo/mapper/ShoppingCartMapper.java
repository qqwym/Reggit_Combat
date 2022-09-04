package com.reggit.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.reggit.demo.bean.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ShoppingCartMapper extends BaseMapper<ShoppingCart> {


}
