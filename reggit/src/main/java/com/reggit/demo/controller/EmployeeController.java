package com.reggit.demo.controller;

import com.alibaba.fastjson.JSON;
import com.reggit.demo.bean.Employee;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/login")
    public String getIndex(){
        return "backend/page/login/login";
    }

    @PostMapping("/login")
    @ResponseBody
    public R<Employee> login(HttpServletRequest request) throws IOException {
        Employee employee = JSON.parseObject(request.getInputStream(), Employee.class);
        R result = employeeService.login(request, employee);
        return result;
    }

    @GetMapping("/page")
    public R<PageDto<Employee>> getPage(HttpServletRequest request){
        return null;
    }

    @PostMapping("")
    @ResponseBody
    //@Transactional(rollbackFor = Exception.class)
    public R<Integer> addEmployee(HttpServletRequest request) throws IOException {
        return null;
    }

    @PutMapping("")
    public R<Integer> editEmployee(HttpServletRequest request, @RequestBody Employee employee) throws IOException {
        return null;
    }

}  