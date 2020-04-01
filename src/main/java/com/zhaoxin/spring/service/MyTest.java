package com.zhaoxin.spring.service;

import com.zhaoxin.spring.dao.AccoutDao;
import com.zhaoxin.spring.domain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/*
模拟一个表现层，用于调用业务层
 */
public class MyTest {
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = (AccountService) as.getBean("accountServiceImplDemo");
//        AccoutDao accoutDao = (AccoutDao) as.getBean("accountDao");
        List<Account> accountList=accountService.findAllAccount();
        System.out.println(accountList);
//        System.out.println(accoutDao);

    }
}
