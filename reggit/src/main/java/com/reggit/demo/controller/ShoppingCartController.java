package com.reggit.demo.controller;


import com.reggit.demo.bean.ShoppingCart;
import com.reggit.demo.common.R;
import com.reggit.demo.service.ShoppingCartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/shoppingCart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping("/list")
    public R getPage(HttpServletRequest request) {
        return null;
    }

    @DeleteMapping("/clean")
    public R clean() {
        return null;
    }

    @PostMapping("/add")
    public R add(@RequestBody ShoppingCart shoppingCart) {
        return null;
    }

    @PostMapping("/sub")
    public R reduce(@RequestBody ShoppingCart shoppingCart, HttpSession session) {
        return null;
    }

}
