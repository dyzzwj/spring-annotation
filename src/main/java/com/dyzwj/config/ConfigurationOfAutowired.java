package com.dyzwj.config;

import com.dyzwj.bean.Car;
import com.dyzwj.bean.Color;
import com.dyzwj.dao.BookDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.awt.print.Book;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MainConnfigurationOfAutowired.java
 * @Description TODO
 * @createTime 2020年07月08日 15:05:00
 */
@Configuration
@ComponentScan({"com.dyzwj.controller","com.dyzwj.dao","com.dyzwj.service","com.dyzwj.bean"})
public class ConfigurationOfAutowired {

    @Primary
    @Bean
    public BookDao bookDao2(){
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }


    //@Bean标注的方法创建对象的时候，方法参数的值从容器中获取，@Autowired可省略
    @Bean
    public Color color(Car car){
        Color color = new Color();
        color.setCar(car);
        return color;
    }






}
