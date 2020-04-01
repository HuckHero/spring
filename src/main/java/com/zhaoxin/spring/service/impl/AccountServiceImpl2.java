package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;

import java.util.Date;
import java.util.List;

public class AccountServiceImpl2 implements AccountService {

    private String name;

    private Integer age;

    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public AccountServiceImpl2() {
        System.out.println("创建了");
    }

    public void saveAccount() {
        System.out.println("name:"+name+";age:"+age+";data:"+birthday);
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
