package com.reggit.demo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.reggie.bean.Orders;
import com.itheima.reggie.bean.User;
import com.itheima.reggie.bean.utilBean.PageDto;
import com.itheima.reggie.common.R;
import com.itheima.reggie.mapper.OrdersMapper;
import com.itheima.reggie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Transactional
@Service
public class OrdersServiceImpl extends ServiceImpl<OrdersMapper, Orders> implements OrdersService {

    @Autowired
    private OrdersMapper mapper;

    @Override
    public R<PageDto<Orders>> getPage(HttpServletRequest request, int page, int pageSize, String name) {
        int setoff = (page-1)*pageSize;
        List<Orders> dish = mapper.getPage(setoff,pageSize,name);
        int total = mapper.getTotal(name);
        PageDto<Orders> page1 = new PageDto<>(dish,total);
        return R.success(page1);
    }

    @Override
    public PageDto<Orders> getUserPage(int page, int pageSize, User user) {
        LambdaQueryWrapper<Orders> lqw = new LambdaQueryWrapper<>();
        lqw.eq(Orders::getUserId,user.getId());
        IPage<Orders> iPage = new Page<>(page,pageSize);
        List<Orders> page1 = (List<Orders>) mapper.selectPage(iPage, lqw);
        PageDto<Orders> pageDto = new PageDto<>(page1,mapper.selectCount(lqw));
        return pageDto;
    }
}
