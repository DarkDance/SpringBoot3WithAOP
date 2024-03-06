package com.oracle.db23c.springboot3withaop.controller;

import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @author wiiyaya
 * @date 2024/3/6
 */
@Service
public class BookServiceImpl implements BookService {

    @Resource
    private BookDao bookDao;

    @Override
    public void saveBook(String name) {
        Book book = new Book();
        book.setId(999L);
        book.setName(name);
        bookDao.save(book);
    }

    @Override
    public Book getBook(String name) {
        return bookDao.findByName(name);
    }
}
