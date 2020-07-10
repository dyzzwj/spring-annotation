package com.dyzwj;

import com.dyzwj.bean.Person;
import com.dyzwj.config.MainConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MainTest.java
 * @Description TODO
 * @createTime 2020年07月04日 10:06:00
 */
public class MainTest {

    public static void main(String[] args) {


        /**
         * 使用配置文件的方式
         */
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) applicationContext.getBean("person");
//        System.out.println(person);


        //使用配置类的方式
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

    }
}
