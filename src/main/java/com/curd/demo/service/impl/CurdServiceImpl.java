package com.curd.demo.service.impl;

import com.curd.demo.entity.Curd;
import com.curd.demo.dao.CurdMapper;
import com.curd.demo.service.ICurdService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangjianye
 * @since 2021-01-06
 */
@Service
public class CurdServiceImpl extends ServiceImpl<CurdMapper, Curd> implements ICurdService {

    @Autowired
    private CurdMapper curdMapper;

    @Override
    public List<Curd> select() {
        List<Curd> list = curdMapper.selectList(null);
        Assert.assertEquals(5,list.size());
        return list;
    }

}
