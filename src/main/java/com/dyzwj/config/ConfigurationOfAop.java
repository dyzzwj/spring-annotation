package com.dyzwj.config;

import com.dyzwj.aop.LogAspect;
import com.dyzwj.aop.MathCaculate;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ConfigurationOfAop.java
 * @Description TODO
 * @createTime 2020年07月09日 15:08:00
 */

@Configuration
@EnableAspectJAutoProxy
public class ConfigurationOfAop {

    @Bean
    public MathCaculate caculate(){
        return new MathCaculate();
    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }


}
