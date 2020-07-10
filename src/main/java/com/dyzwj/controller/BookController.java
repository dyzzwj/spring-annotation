package com.dyzwj.controller;

import com.dyzwj.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @author zhengwenjie
 * @version 1.0.0
 * @ClassName BookController.java
 * @Description TODO
 * @createTime 2020年07月04日 10:26:00
 */
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Override
    public String toString() {
        return "BookController{" +
                "bookService=" + bookService +
                '}';
    }
}
