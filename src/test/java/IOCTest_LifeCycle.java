import com.dyzwj.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_LifeCycle.java
 * @Description TODO
 * @createTime 2020年07月05日 20:03:00
 */
public class IOCTest_LifeCycle {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器加载...");
        applicationContext.getBean("car");
        applicationContext.close();

    }


}
