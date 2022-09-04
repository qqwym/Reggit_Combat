package com.reggit.demo.controller;

import com.alibaba.fastjson.JSON;

import com.reggit.demo.bean.Dish;
import com.reggit.demo.bean.DishFlavor;
import com.reggit.demo.bean.utilBean.DishDto;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.service.DishService;
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
@RequestMapping("/dish")
public class DishControlle {

    @Autowired
    private DishService dishService;

    @GetMapping("/page")
    public R getPage(HttpServletRequest request){
        return null;
    }

    //新增
    @PostMapping("")
    @ResponseBody
    public R<Integer> addDish(HttpServletRequest request) throws IOException {
        return null;

    }

    //修改
    @PutMapping
    @ResponseBody
    public R editDish(@RequestBody DishDto dIshDto, HttpServletRequest request) throws IOException {
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
    public R delete(HttpServletRequest request) throws IOException {
       return null;
    }

    @GetMapping("/list")
    public R gitList(HttpServletRequest request){
        return null;
    }


}
