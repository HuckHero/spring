package com.zhaoxin.spring.dao.impl;

import com.zhaoxin.spring.dao.AccoutDao;
import com.zhaoxin.spring.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements AccoutDao {
    public void saveAccount() {
        System.out.println("dao func");
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
