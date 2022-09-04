package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reggit.demo.bean.Employee;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.common.R;
import com.reggit.demo.mapper.EmployeeMapper;
import com.reggit.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;


@Transactional
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

    @Autowired
    private EmployeeMapper mapper;

    /**
     * 员工登录
     * @param request
     * @param employee
     * @return
     */
    @Override
    @PostMapping("/login")
    public R<Employee> login(HttpServletRequest request, @RequestBody Employee employee){

        //1、将页面提交的密码password进行md5加密处理
        String password = employee.getPassword();
        password = DigestUtils.md5DigestAsHex(password.getBytes());

        //2、根据页面提交的用户名username查询数据库
        LambdaQueryWrapper<Employee> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Employee::getUsername,employee.getUsername());
        Employee emp = getOne(queryWrapper);

        //3、如果没有查询到则返回登录失败结果
        if(emp == null){
            return R.error("登录失败");
        }

        //4、密码比对，如果不一致则返回登录失败结果
        if(!emp.getPassword().equals(password)){
            return R.error("登录失败");
        }

        //5、查看员工状态，如果为已禁用状态，则返回员工已禁用结果
        if(emp.getStatus() == 0){
            return R.error("账号已禁用");
        }

        //6、登录成功，将员工id存入Session并返回登录成功结果
        request.getSession().setAttribute("employee",emp);
        return R.success(emp);
    }

    /**
     * 员工查询
     * @param request
     * @param page
     * @param pageSize
     * @param name
     * @return
     */
    @Override
    public R getPage(HttpServletRequest request, int page, int pageSize, String name, Long id) {
        return null;
    }

    /**
     * 添加员工
     * @param request
     * @param employee
     * @return
     */
    @Override
    public R addEmployee(HttpServletRequest request, Employee employee, long id){
        return null;
    }

    /**
     * 修改
     * @param request
     * @param employee
     * @param id
     * @return
     */
    @Override
    public R editEmployee(HttpServletRequest request, Employee employee, long id) {
        return null;
    }


}
