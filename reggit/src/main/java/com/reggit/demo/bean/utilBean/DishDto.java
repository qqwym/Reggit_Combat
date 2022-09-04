package com.reggit.demo.bean.utilBean;

import com.itheima.reggie.bean.Dish;
import com.itheima.reggie.bean.DishFlavor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DishDto extends Dish{
    private String categoryName;
    private List<DishFlavor> flavors = new ArrayList<>();
    //private Integer copies;
}
