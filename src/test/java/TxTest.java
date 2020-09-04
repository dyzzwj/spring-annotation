import com.dyzwj.tx.TxConfig;
import com.dyzwj.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName TxTest.java
 * @Description TODO
 * @createTime 2020年07月15日 19:17:00
 */
public class TxTest {

    @Test
    public void test1(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = applicationContext.getBean(UserService.class);
        userService.insert();

    }


    @Test
    public void test2(){

        LinkedHashMap<String,String> map = new LinkedHashMap<>();
        map.put(null, null);
        Set<Map.Entry<String, String>> entries = map.entrySet();
//        entries.forEach( x -> System.out.println(x.getKey() + ":" + x.getValue()));
    }


    @Test
    public void test3(){



        System.out.println("四".compareTo("三") );
    }
}
