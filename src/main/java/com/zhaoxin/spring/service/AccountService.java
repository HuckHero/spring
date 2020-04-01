package com.zhaoxin.spring.service;

import com.zhaoxin.spring.domain.Account;

import java.util.List;

public interface AccountService {
    void saveAccount();
    List<Account> findAllAccount();
}
