package com.zhaoxin.spring.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String name;

    private int id;

    private float maney;

    public Account(String name, Integer id, float maney) {
        this.name = name;
        this.id = id;
        this.maney = maney;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public float getManey() {
        return maney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", maney=" + maney +
                '}';
    }

    public void setManey(float maney) {
        this.maney = maney;
    }
}
