package com.reggit.demo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.reggit.demo.bean.Category;
import com.reggit.demo.bean.utilBean.PageDto;


import javax.servlet.http.HttpServletRequest;
import java.sql.SQLIntegrityConstraintViolationException;

public interface CategoryService extends IService<Category> {

    PageDto<Category> getPage(HttpServletRequest request, int page, int pageSize, int type);

    Integer addCategory(HttpServletRequest request, Category category, long id)throws SQLIntegrityConstraintViolationException;

    Integer editCategory(HttpServletRequest request, Category category, long id);

    Integer deleteCategory(long id);

}
