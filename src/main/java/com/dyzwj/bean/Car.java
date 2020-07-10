package com.dyzwj.bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Car.java
 * @Description TODO
 * @createTime 2020年07月05日 20:01:00
 */
@Component
public class Car {

    public Car(){
        System.out.println("car 创建...");
    }

    public void init(){
        System.out.println("car init...");
    }

    public void destroy(){
        System.out.println("car destroy...");
    }
}
