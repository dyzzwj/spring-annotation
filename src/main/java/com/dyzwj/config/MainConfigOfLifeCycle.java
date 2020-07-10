package com.dyzwj.config;

import com.dyzwj.bean.Car;
import com.dyzwj.bean.Hat;
import com.dyzwj.bean.World;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MainConfigOfLifeCycle.java
 * @Description TODO
 * @createTime 2020年07月05日 20:03:00
 */
@Configuration
@ComponentScan(basePackages = "com.dyzwj.bean")
@Import({Hat.class, World.class})
public class MainConfigOfLifeCycle {

//    @Scope("prototype")
    @Bean(initMethod = "init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

}
