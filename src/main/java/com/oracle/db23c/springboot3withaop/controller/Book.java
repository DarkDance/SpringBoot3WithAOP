package com.oracle.db23c.springboot3withaop.controller;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.io.Serializable;

/**
 * @author wiiyaya
 * @date 2024/3/6
 */
@Entity
public class Book implements Serializable {

    private Long id;

    private String name;

    @Id
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
