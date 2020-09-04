package com.dyzwj.en;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName Service.java
 * @Description TODO
 * @createTime 2020年08月06日 16:26:00
 */
public enum  Service {

    Person("aaa"),
    AAAA("bbb");

    private String name;

    Service(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Service{" +
                "name='" + name + '\'' +
                '}';
    }
}
