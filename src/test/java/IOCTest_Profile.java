import com.dyzwj.config.ConfigurationOfProfile;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.util.Map;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_Profile.java
 * @Description TODO
 * @createTime 2020年07月08日 17:33:00
 */
public class IOCTest_Profile {



    @Test
    public void test2(){
        //1、使用无参构造创建一个AnnotationConfigApplicationContext
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
        //2、设置需要激活的环境，可以设置多个
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //3、注册主配置类
        applicationContext.register(ConfigurationOfProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();


        String[] names = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationOfProfile.class);

        String[] names = applicationContext.getBeanNamesForType(DataSource.class);
        for (String name : names) {
            System.out.println(name);
        }


    }
}
