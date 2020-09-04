package com.dyzwj.inter;

import com.sun.org.apache.xml.internal.security.signature.reference.ReferenceNodeSetData;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName ReferenceValue.java
 * @Description TODO
 * @createTime 2020年08月10日 11:49:00
 */
public class ReferenceValue {



    void foo(String text) {
        text = "windows";
    }

    void foo(Person person){
        person.name = "郑文杰";
    }

    public static void main(String[] args) {

        ReferenceValue referenceValue = new ReferenceValue();
        String str = "linux";
        referenceValue.foo(str);
        System.out.println(str);

        Person person = new Person();
        person.name = "zwj";
        referenceValue.foo(person);
        System.out.println(person.name);


    }
}


class Person{
    String name;

}