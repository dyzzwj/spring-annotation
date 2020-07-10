package com.dyzwj.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Person.java
 * @Description TODO
 * @createTime 2020年07月04日 10:04:00
 */
public class Person {

    @Value("${person.name}")
    private String name;

    @Value("#{20+2}")
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
