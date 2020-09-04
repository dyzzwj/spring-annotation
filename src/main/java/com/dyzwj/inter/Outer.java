package com.dyzwj.inter;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Outer.java
 * @Description TODO
 * @createTime 2020年08月10日 10:39:00
 */
public class Outer {


    private static int radius = 1;

    private int counter = 4;

    private  int out_a = 1;
    private static int STATIC_b = 2;

    /**
     * 静态内部类
     */
    static class StaticInner{

        public void visit(){
            System.out.println("访问外部类静态变量：" + radius);
        }
    }

    /**
     * 成员内部类
     */
    class Inner{

        public void visit(){
            System.out.println("访问外部类静态变量：" + radius);
            System.out.println("访问外部类非静态变量：" + counter);
        }
    }


    public void test(){
        int inner_c = 9;

        /**
         * 局部内部类
         */
        class Inner1 {
            private void fun(){
                System.out.println(out_a);
                System.out.println(STATIC_b);
                System.out.println(inner_c);
            }
        }

        Inner1 inner = new Inner1();
        inner.fun();




    }




}
