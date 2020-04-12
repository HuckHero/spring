package com.zhaoxin.spring.client;

import com.zhaoxin.spring.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AOPTest {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOPbean.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("AOPZhuJiebean.xml");
        AccountService accountService= (AccountService) applicationContext.getBean("accountService");
        accountService.saveAccount();
    }
}
