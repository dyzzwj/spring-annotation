package com.dyzwj.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName UserService.java
 * @Description TODO
 * @createTime 2020年07月15日 19:21:00
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;


    @Transactional
    public void insert(){
        userDao.insertUser();
        System.out.println("添加user成功");
        int i = 10 /0;
    }


}
