package com.reggit.demo.controller;


import com.reggit.demo.bean.Setmeal;
import com.reggit.demo.bean.SetmealDish;
import com.reggit.demo.bean.utilBean.DishDto;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.bean.utilBean.SetmealDto;
import com.reggit.demo.common.R;
import com.reggit.demo.service.DishService;
import com.reggit.demo.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/setmeal")
public class SetmealControlle {

    @Autowired
    private SetmealService setmealService;

    @Autowired
    private DishService dishService;


    @GetMapping("/page")
    public R getPage(HttpServletRequest request){
        return null;
    }

    @PostMapping("")
    public R addSetmeal(@RequestBody SetmealDto setmealDto, HttpServletRequest request){
        return null;
    }

    @GetMapping("/{id}")
    public R getSetmeal(@PathVariable long id, HttpServletRequest request){
        return null;
    }

    @PutMapping("")
    public R editSetmeal(@RequestBody SetmealDto setmealDto, HttpServletRequest request){
        return null;
    }

    @PostMapping("/status/0")
    public R editstatus(HttpServletRequest request) throws IOException {
        return null;
    }

    @PostMapping("/status/1")
    public R editStatus1(HttpServletRequest request) throws IOException {
        return null;
    }

    @DeleteMapping("")
    public R deleteSt(HttpServletRequest request){
        return null;
    }

    @GetMapping("/list")
    public R getList(HttpServletRequest request){
        return null;
    }

}
