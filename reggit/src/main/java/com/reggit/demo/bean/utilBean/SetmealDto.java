package com.reggit.demo.bean.utilBean;

import com.reggit.demo.bean.Setmeal;
import com.reggit.demo.bean.SetmealDish;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SetmealDto extends Setmeal {
    private String categoryName;
    private List<SetmealDish> setmealDishes;

}
