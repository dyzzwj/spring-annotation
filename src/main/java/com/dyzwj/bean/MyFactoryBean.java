package com.dyzwj.bean;

import org.springframework.beans.factory.FactoryBean;


/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MyFactoryBean.java
 * @Description TODO
 * @createTime 2020年07月05日 19:30:00
 */
public class MyFactoryBean implements FactoryBean<Color> {

    public Color getObject() throws Exception {
        System.out.println("MyFactoryBean...");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    //是否单例
    public boolean isSingleton() {
        return true;
    }

}
