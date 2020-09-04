import com.dyzwj.aop.MathCaculate;
import com.dyzwj.config.ConfigurationOfAop;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


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
//        System.out.println(mathCaculate);
        mathCaculate.div(1,1);

    }

    @Test
    public void test2(){

        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        int size = lists.size();
        for (int i = 0; i < lists.size(); i++) {
            if(3==lists.get(i) || 4 == lists.get(i)){
                lists.remove(i); //[1, 2, 4, 5]
//                lists.remove(lists.get(i));//[1, 2, 4, 5]
            }
        }

        System.out.println(lists);
    }


    @Test
    public  void test3(){

        List<Integer> lists = new ArrayList<Integer>();
        lists.add(1);
        lists.add(2);
        lists.add(3);
        lists.add(4);
        lists.add(5);
        Iterator<Integer> iterator = lists.iterator();
        while (iterator.hasNext()){
            int next = iterator.next();
            if(next == 3 || next == 4){
                iterator.remove();
            }
            System.out.println(lists.size());
        }
        System.out.println(lists);
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;

    }

    @Test
    public void test4(){

       String str = " abc kk   \t    ";

        System.out.println(replaceBlank(str));
    }
}
