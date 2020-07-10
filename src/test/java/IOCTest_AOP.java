import com.dyzwj.aop.MathCaculate;
import com.dyzwj.config.ConfigurationOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_AOP.java
 * @Description TODO
 * @createTime 2020年07月09日 15:13:00
 */
public class IOCTest_AOP {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationOfAop.class);
        MathCaculate mathCaculate = applicationContext.getBean(MathCaculate.class);
        System.out.println(mathCaculate);
        mathCaculate.div(1,1);
    }
}
