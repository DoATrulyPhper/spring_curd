package com.curd.demo;

import cn.hutool.json.JSONObject;
import com.curd.demo.dao.CurdMapper;
import com.curd.demo.entity.Curd;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleTest {

    @Autowired
    private CurdMapper curdMapper;

    @Test
    public void select(){
        List<Curd> list = curdMapper.selectList(null);
        Assert.assertEquals(5,list.size());
        list.forEach(System.out::println);
    }
    
    @Test
    public void insert() {
        Curd curd = new Curd();
        curd.setName("测试");
        int rows = curdMapper.insert(curd);
        System.out.println("插入:"+rows);
    }

    @Test
    public void getOne(){
        Curd curd = curdMapper.selectById(2);
        System.out.println(curd);
    }

    @Test
    public void delete(){
        int rows = curdMapper.deleteById(1);
        System.out.println(rows);
    }

    @Test
    public void update(){
        Curd curd = new Curd();
        curd.setId(2L);
        curd.setName("1111");
        curdMapper.updateById(curd);
    }
}
