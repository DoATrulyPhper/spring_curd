package com.curd.demo.entity;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author zhangjianye
 * @since 2021-01-06
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class Curd implements Serializable {

//    private static final long serialVersionUID = 1L;

    private Long id;

    private String name;


}
