package com.dyzwj.config;

import com.dyzwj.bean.Person;
import com.dyzwj.service.BookService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MainConfiguration.java
 * @Description TODO
 * @createTime 2020年07月04日 10:11:00
 */

//配置类 == 配置文件
@Configuration //告诉spring这是一个配置类
@ComponentScan(value = "com.dyzwj",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {BookService.class}),
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class MainConfiguration {

    //给容器中注册一个bean bean的类型为返回值的类型 id为方法名
    @Bean
    public Person person(){
        return new Person("dyz",21);
    }
}
