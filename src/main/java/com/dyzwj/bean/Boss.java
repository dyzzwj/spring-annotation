package com.dyzwj.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Boss.java
 * @Description TODO
 * @createTime 2020年07月08日 16:02:00
 */
@Component
public class Boss {



    private Car car;

    private Hat hat;


    //构造器要用的组件，从ioc容器中获取

    @Autowired
    public Boss(Car car){
        this.car = car;
        System.out.println("Boss 有参构造...");
    }

    public Boss(Car car,Hat hat){
        this.car = car;
        this.hat = hat;
        System.out.println("Boss 两个有参构造...");
    }
    public Car getCar() {
        return car;
    }


    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
