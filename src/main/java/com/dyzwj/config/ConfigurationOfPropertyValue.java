package com.dyzwj.config;

import com.dyzwj.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ConfigurationOfPropertyValue.java
 * @Description TODO
 * @createTime 2020年07月08日 14:43:00
 */
@Configuration
@PropertySource("classpath:/customer.properties")
public class ConfigurationOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }


}
