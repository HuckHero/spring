package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;

import java.sql.Array;
import java.util.*;

public class AccountServiceImpl3 implements AccountService {

    private String[] myStr;

    private List<String> mylist;

    private Set<String> mySet;

    private Map<String, String> myMap;

    public void setMyStr(String[] myStr) {
        this.myStr = myStr;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public AccountServiceImpl3() {
        System.out.println("创建了");
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStr));
        System.out.println(mylist);
        System.out.println(myMap);
        System.out.println(mySet);
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
