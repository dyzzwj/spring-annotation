package com.dyzwj.inter;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName DefaultInterface.java
 * @Description TODO
 * @createTime 2020年08月10日 10:20:00
 */
public interface DefaultInterface {


    default void test(){
        System.out.println("aaa");
    }
}
