package com.zhaoxin.spring.client;

import com.zhaoxin.spring.service.AccountService;
import com.zhaoxin.spring.service.impl.AccountServiceImpl;

/**
 * 模拟一个工厂类，可能存在jar包里，无法通过构造器创建bean
 */
public class InstanceFactory {
    public AccountService getAccountService(){
        return  new AccountServiceImpl();
    }
}
