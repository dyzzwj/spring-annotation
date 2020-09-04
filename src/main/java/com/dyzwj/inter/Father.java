package com.dyzwj.inter;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Father.java
 * @Description TODO
 * @createTime 2020年08月10日 10:35:00
 */
public class Father {
    String name = "father";

    public void test1(){
        System.out.println("father...");
    }

    public static void main(String[] args) {

        Father father = new Son();
        father.test1();
        System.out.println(father.name);
    }
}


class Son extends Father{


    String name = "son";
    @Override
    public void test1(){

        System.out.println("son...");
    }
}


