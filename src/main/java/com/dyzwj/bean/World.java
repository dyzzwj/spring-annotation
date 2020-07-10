package com.dyzwj.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName World.java
 * @Description TODO
 * @createTime 2020年07月08日 10:27:00
 */
public class World implements InitializingBean, DisposableBean {


    public World(){
        System.out.println("world 创建...");
    }

    public void destroy() throws Exception {
        System.out.println("world...DisposableBean...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("world...InitializingBean...");
    }
}
