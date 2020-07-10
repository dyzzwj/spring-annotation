package com.dyzwj.config;

import com.dyzwj.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName MyImportBeanDefinitionRegistrar.java
 * @Description TODO
 * @createTime 2020年07月05日 19:09:00
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean definition = registry.containsBeanDefinition("com.dyzwj.bean.Yellow");
        boolean definition1 = registry.containsBeanDefinition("com.dyzwj.bean.Blue");
        if(definition && definition1){
            RootBeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
//            beanDefinition.setScope();
            registry.registerBeanDefinition("rainBow",beanDefinition);

        }

    }
}
