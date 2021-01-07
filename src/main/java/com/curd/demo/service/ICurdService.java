package com.curd.demo.service;

import com.curd.demo.entity.Curd;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangjianye
 * @since 2021-01-06
 */
public interface ICurdService extends IService<Curd> {
    List<Curd> select();
}
