package com.reggit.demo.controller;



import com.reggit.demo.bean.util.ValidateCodeUtils;
import com.reggit.demo.common.R;
import com.reggit.demo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;

@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/sendCode/{phone}")
    public R sendCode(@PathVariable("phone") String phone, HttpSession session) {
        return null;
    }

    @PostMapping("/login")
    public R login(@RequestBody Map<String, String> s, HttpSession session) {
        return null;
    }
}
