package com.dyzwj.config;

import com.dyzwj.bean.MyFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ConfigOfFactoryBean.java
 * @Description TODO
 * @createTime 2020年07月30日 10:17:00
 */
@Configuration
//@Import导入的组件的id默认是全类名
@Import(MyFactoryBean.class)
public class ConfigOfFactoryBean {





}
