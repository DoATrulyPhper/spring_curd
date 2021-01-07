package com.curd.demo.controller;


import com.curd.demo.entity.Curd;
import com.curd.demo.service.impl.CurdServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author zhangjianye
 * @since 2021-01-06
 */
@RestController
@RequestMapping("/curd")
public class CurdController {

    @Autowired
    private CurdServiceImpl curdService;

    @GetMapping("/select")
    public List<Curd> select() {
        return curdService.select();
    }
}
