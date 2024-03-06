package com.oracle.db23c.springboot3withaop.controller;

/**
 * @author wiiyaya
 * @date 2024/3/6
 */
public interface BookService {
    void saveBook(String name);

    Book getBook(String name);
}
