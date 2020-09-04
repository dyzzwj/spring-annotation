import com.dyzwj.en.Service;
import com.dyzwj.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.jnlp.IntegrationService;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.function.Consumer;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ExtTest.java
 * @Description TODO
 * @createTime 2020年07月16日 11:59:00
 */
public class ExtTest {

    @Test
    public void test1(){

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

    }

    @Test
    public void test2(){
        Service[] values = Service.values();
        for (Service service : values ){
            System.out.println(service.toString());
        }
    }


    @Test
    public void test3(){
        TreeSet<String> treeSet = new TreeSet<>(String::compareTo);
    }


    public void test4(){
        //1、无参、无返回值

        Runnable runnable = () -> {
            System.out.println("aaaaa");
        };


        //2、Lambda需要一个参数，但没有返回值
        Consumer<String> consumer = (String x) -> {
            System.out.println(x);
        };

        //3、数据类型可以省略，因为可由编译期进行类型推断
        Consumer<String> consumer1 = x -> {
            System.out.println(x);
        };

        //4、Lambda 若只需要一个参数时，参数的小括号可以省略
        Consumer<String> consumer2 = x -> {
            System.out.println(x);
        };

        //5、Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
        Comparator<Integer> comparator = (x,y) -> {
            System.out.println(x);
            System.out.println(y);
            return Integer.compare(x,y);
        };

        //6、当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
        Comparator<Integer> comparator1 = (x,y) -> Integer.compare(x,y);



    }

}
