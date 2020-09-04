package com.dyzwj.inter;

import java.util.*;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName TestOuter.java
 * @Description TODO
 * @createTime 2020年08月10日 10:44:00
 */
public class TestOuter {

    public static void main(String[] args) {
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.visit();

        System.out.println(staticInner);
        System.out.println(staticInner.hashCode());


        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.visit();

//        TreeSet<Outer> treeSet = new TreeSet<>();
//        treeSet.add(outer);




        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);

        Integer i3 = 127;
        Integer i4 = 127;
        System.out.println(i3 == i4);

        Byte b1 = 3;
        Byte b2 = 3;
        System.out.println(b1 == b2);



        Map<String,String> map = new LinkedHashMap<>();
        map.put("1","1");
        map.put("5","5");
        map.put("3","3");
        map.put("6","6");
        map.put("4","4");
        map.forEach((x,y) -> System.out.println(x+ ":" + y));


    }
}

final class A{

}