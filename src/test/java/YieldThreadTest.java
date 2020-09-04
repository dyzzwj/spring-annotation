/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName YieldThreadTest.java
 * @Description TODO
 * @createTime 2020年07月27日 11:28:00
 */

/**
 * Thread.yield()：使当前线程由执行状态变为就绪状态
 */
public class YieldThreadTest extends Thread{

    public YieldThreadTest(String name){
        super(name);
    }


    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {

            System.out.println(Thread.currentThread().getName()+ "：" + i);
            if(i == 30){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {

        YieldThreadTest threadTest1 = new YieldThreadTest("张三");
        YieldThreadTest threadTest2 = new YieldThreadTest("李四");
        threadTest1.start();
        threadTest2.start();
    }
}
