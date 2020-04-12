package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;

import java.util.List;

public class AccountServiceImplAOP implements AccountService {
    public void saveAccount() {
        System.out.println("saveAccount");
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
