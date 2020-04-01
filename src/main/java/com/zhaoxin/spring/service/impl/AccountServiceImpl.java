package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;

import java.util.Date;
import java.util.List;

public class AccountServiceImpl  implements AccountService {

    private String name;

    private Integer age;

    private Date birthday;

    public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public AccountServiceImpl() {
        System.out.println("创建了");
    }

    public void saveAccount() {
        System.out.println("name:"+name+";age:"+age+";data:"+birthday);
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
