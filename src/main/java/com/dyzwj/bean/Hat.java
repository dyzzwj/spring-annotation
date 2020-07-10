package com.dyzwj.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Hat.java
 * @Description TODO
 * @createTime 2020年07月08日 10:24:00
 */

@Component
public class Hat {

    public Hat() {
        System.out.println("hat 创建");
    }

    @PostConstruct
    public void init(){
        System.out.println("hat PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }


}
