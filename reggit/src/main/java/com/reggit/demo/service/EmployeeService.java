package com.reggit.demo.service;



import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.Employee;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;

public interface EmployeeService extends IService<Employee> {

    R login(HttpServletRequest request, @RequestBody Employee employee);

    R getPage(HttpServletRequest request, int page, int pageSize, String name, Long id);

    R addEmployee(HttpServletRequest request, Employee employee, long id);

    R editEmployee(HttpServletRequest request, Employee employee, long id);


}
