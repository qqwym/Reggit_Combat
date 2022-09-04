package com.reggit.demo.controller;



import com.reggit.demo.bean.Category;
import com.reggit.demo.bean.utilBean.ListS;
import com.reggit.demo.common.R;
import com.reggit.demo.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    /**
     * 获取数据
     * @param request
     * @return
     */
    @GetMapping("/page")
    public R getPage(HttpServletRequest request){
        return null;
    }

    /**
     * 添加
     * @param request
     * @return
     * @throws IOException
     */
    @PostMapping("")
    public R addCategory(HttpServletRequest request) throws IOException {
        return null;
    }

    /**
     * 修改
     * @param request
     * @param category
     * @return
     */
    @PutMapping("")
    public R editCategory(HttpServletRequest request, @RequestBody Category category){
        return null;
    }

    /**
     * 删除
     * @param request
     * @return
     */
    @DeleteMapping("")
    public R deleteCategory(HttpServletRequest request){
        return null;
    }
    @GetMapping("/list")
    public R getList(HttpServletRequest request){
        return null;
    }


}
