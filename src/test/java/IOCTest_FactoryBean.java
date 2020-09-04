import com.dyzwj.bean.Color;
import com.dyzwj.config.ConfigOfFactoryBean;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_FactoryBean.java
 * @Description TODO
 * @createTime 2020年07月30日 10:18:00
 */
public class IOCTest_FactoryBean {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigOfFactoryBean.class);
        String[] names = applicationContext.getBeanDefinitionNames();
        Arrays.asList(names).forEach(System.out::println);
//        Color bean = applicationContext.getBean(Color.class);

        applicationContext.getBean("com.dyzwj.bean.MyFactoryBean");

    }
}
