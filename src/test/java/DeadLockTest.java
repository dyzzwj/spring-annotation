import com.dyzwj.bean.DeadLock;
import org.junit.Test;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DeadLockTest.java
 * @Description TODO
 * @createTime 2020年07月28日 10:19:00
 */
public class DeadLockTest {

    @Test
    public void test1(){

        DeadLock deadLock=new DeadLock();
        DeadLock deadLock1=new DeadLock();
        deadLock.flag=true;
        deadLock1.flag=false;
        Thread t1=new Thread(deadLock);
        Thread t2=new Thread(deadLock1);
        t1.start();
        t2.start();

    }

    @Test
    public void test2(){

        int i = Integer.parseInt("42801F", 16);
        System.out.println(i);

        //保存低16位
        int j;
        System.out.println(j = i & 0xffff);
        System.out.println(i = i >> 16);
        System.out.println(i = i << 16);

        System.out.println(Integer.toHexString(i + j));

    }

}
