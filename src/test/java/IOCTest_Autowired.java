import com.dyzwj.bean.Boss;
import com.dyzwj.bean.Car;
import com.dyzwj.bean.Color;
import com.dyzwj.config.ConfigurationOfAutowired;
import com.dyzwj.dao.BookDao;
import com.dyzwj.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.awt.print.Book;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName IOCTest_Autowired.java
 * @Description TODO
 * @createTime 2020年07月08日 15:07:00
 */
public class IOCTest_Autowired {

    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(ConfigurationOfAutowired.class);



    @Test
    public void test2(){

        Boss bean = applicationContext.getBean(Boss.class);
        System.out.println(bean);


        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);


    }


    @Test
    public void test1(){

        BookService bean = applicationContext.getBean(BookService.class);
        System.out.println(bean);

        BookDao bookDao = applicationContext.getBean(BookDao.class);
        System.out.println(bookDao);

        String[] names = applicationContext.getBeanNamesForType(BookDao.class);
        for (String name : names) {

            System.out.println(name);
        }

    }



}
