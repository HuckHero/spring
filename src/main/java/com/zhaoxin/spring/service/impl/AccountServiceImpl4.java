package com.zhaoxin.spring.service.impl;

import com.zhaoxin.spring.dao.AccoutDao;
import com.zhaoxin.spring.domain.Account;
import com.zhaoxin.spring.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
*component:将当前类对象存入spring容器里。属性：value用于指定bean的id，默认当前类名，并首字母小写
* Controller：表现层
* Service：业务层
* Repository：持久层
* 同component，明确三层架构
*
* Autowired:自动注入容易中唯一一个bean对象类型匹配的变量
* 出现的位置：变量，方法
*
* scope:作用范围
* 取值：singleton prototype
*
* preDestory:销毁方法
*
* postConstruct:初始化
*/
public class AccountServiceImpl4 implements AccountService {

    @Autowired
    private AccoutDao accoutDao;

    public AccountServiceImpl4() {
        System.out.println("创建了");
    }

    public void saveAccount() {
        accoutDao.saveAccount();
    }

    public List<Account> findAllAccount() {
        return null;
    }
}
