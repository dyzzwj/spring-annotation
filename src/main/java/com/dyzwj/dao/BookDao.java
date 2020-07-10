package com.dyzwj.dao;

import org.springframework.stereotype.Repository;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName BookDao.java
 * @Description TODO
 * @createTime 2020年07月04日 10:27:00
 */
@Repository
public class BookDao {

    private String lable = "1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    @Override
    public String toString() {
        return "BookDao{" +
                "lable='" + lable + '\'' +
                '}';
    }
}
