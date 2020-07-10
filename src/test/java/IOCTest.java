import com.dyzwj.bean.Color;
import com.dyzwj.bean.Person;
import com.dyzwj.config.MainConfiguration2;
import com.dyzwj.config.MainConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest.java
 * @Description TODO
 * @createTime 2020年07月04日 10:25:00
 */
public class IOCTest {

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration2.class);


    @Test
    public void test5(){
        print(applicationContext);

    }



    @Test
    public void test4(){

        print(applicationContext);
        System.out.println("加载容器...");
        Object bean = applicationContext.getBean("myFactoryBean");
        Object bean1 = applicationContext.getBean("myFactoryBean");
        System.out.println("myFactoryBean:" + bean.getClass());

        Object bean2 = applicationContext.getBean("&myFactoryBean");
        System.out.println(bean2.getClass());
        System.out.println(bean == bean1);
    }

    public void print(ApplicationContext applicationContext){
        String[] names = applicationContext.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }

    @Test
    public void test3(){

        String[] names = applicationContext.getBeanNamesForType(Person.class);
        for (String name : names) {
            System.out.println(name);
        }
        String property = applicationContext.getEnvironment().getProperty("os.name");
        System.out.println(property);
        Map<String, Person> beans = applicationContext.getBeansOfType(Person.class);
        System.out.println(beans);
    }

    @Test
    public void test1(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {

            System.out.println(beanDefinitionName);
        }
    }


    @Test
    public void test2(){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfiguration2.class);
        System.out.println("加载ioc容器");
        Object person1 = applicationContext.getBean("person");
        Object person2 = applicationContext.getBean("person");
        System.out.println(person1 == person2);


    }
}
