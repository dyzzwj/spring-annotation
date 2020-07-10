package com.dyzwj.config;

import com.dyzwj.bean.Blue;
import com.dyzwj.bean.MyFactoryBean;
import com.dyzwj.bean.Person;
import com.dyzwj.bean.Yellow;
import com.dyzwj.condition.LinuxCondition;
import com.dyzwj.condition.MacCondition;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.*;
import sun.applet.Main;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MainConfig2.java
 * @Description TODO
 * @createTime 2020年07月05日 16:33:00
 */

@Conditional(MacCondition.class)
@Configuration
@Import({Yellow.class, Blue.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfiguration2 {

//    @Scope("singleton")
//    @Lazy
    @Bean
    public Person person(){
        System.out.println("创建person对象...");
        return new Person("zwj",22);
    }

    @Conditional(LinuxCondition.class)
    @Bean("linus")
    public Person person01(){
        return new Person("linus",48);
    }

    @Bean("qiao")
    public Person person02(){
        return new Person("qiao",67);
    }



    @Bean
    public MyFactoryBean myFactoryBean(){
        return new MyFactoryBean();
    }



}
