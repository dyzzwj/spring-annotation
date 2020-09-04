package com.dyzwj.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.xml.ws.spi.WebServiceFeatureAnnotation;
import java.util.Random;
import java.util.UUID;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName UserDao.java
 * @Description TODO
 * @createTime 2020年07月15日 19:18:00
 */

@Repository
public class UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;



    public void insertUser(){

        String sql = "insert into user(id,name) values (?,?)";
        int id = new Random().nextInt();
        jdbcTemplate.update(sql,id,"zwj");
    }
}
