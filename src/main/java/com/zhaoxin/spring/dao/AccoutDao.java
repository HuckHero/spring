package com.zhaoxin.spring.dao;

import com.zhaoxin.spring.domain.Account;

import java.util.List;

public interface AccoutDao {
    void saveAccount();

    List<Account> findAllAccount();
}
