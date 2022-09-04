package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.reggit.demo.bean.Category;
import com.reggit.demo.bean.utilBean.PageDto;
import com.reggit.demo.mapper.CategoryMapper;
import com.reggit.demo.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


@Transactional
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

    @Autowired
    private CategoryMapper mapper;

    /**
     * 员工查询
     * @param request
     * @param page
     * @param pageSize
     * @return
     */
    @Override
    public PageDto<Category> getPage(HttpServletRequest request, int page, int pageSize, int type) {
        return null;
    }

    @Override
    public Integer addCategory(HttpServletRequest request, Category category, long id) throws SQLIntegrityConstraintViolationException {
        return null;
    }

    @Override
    public Integer editCategory(HttpServletRequest request, Category category, long id) {
        return null;
    }

    @Override
    public Integer deleteCategory(long id) {
        return null;
    }


}
