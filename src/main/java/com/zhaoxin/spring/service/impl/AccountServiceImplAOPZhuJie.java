package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImplAOPZhuJie implements AccountService {
    public void saveAccount() {
        System.out.println("saveAccount");
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
