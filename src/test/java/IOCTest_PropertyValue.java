import com.dyzwj.bean.Person;
import com.dyzwj.config.ConfigurationOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_PropertyValue.java
 * @Description TODO
 * @createTime 2020年07月08日 14:44:00
 */
public class IOCTest_PropertyValue {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationOfPropertyValue.class);

    @Test
    public void test1(){

        Person bean = applicationContext.getBean(Person.class);
        System.out.println(bean);

        ConfigurableEnvironment environment = applicationContext.getEnvironment();
        System.out.println(environment.getProperty("person.name"));

    }
}
