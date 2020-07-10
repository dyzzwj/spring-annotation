package com.dyzwj.service;

import com.dyzwj.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName BookService.java
 * @Description TODO
 * @createTime 2020年07月04日 10:26:00
 */
@Service
public class BookService {

    @Qualifier("bookDao2")
//    @Autowired(required = false)
    @Resource
    private BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}

