package com.oracle.db23c.springboot3withaop.controller;

import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Resource
    private BookService bookService;

    @RequestMapping("/saveBook")
    public String saveBook(String name){
        bookService.saveBook(name);
        return "Success!";
    }

    @RequestMapping("/getBook")
    public String getBook(String name){
        Book book = bookService.getBook(name);
        return "Book id is: " + book.getId();
    }
}
