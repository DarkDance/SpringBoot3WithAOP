package com.oracle.db23c.springboot3withaop.controller;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author wiiyaya
 * @date 2024/3/6
 */
public interface BookDao extends JpaRepository<Book, Long> {
    Book findByName(String name);
}
