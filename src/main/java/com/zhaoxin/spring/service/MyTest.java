package com.zhaoxin.spring.service;

import com.zhaoxin.spring.dao.AccoutDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
模拟一个表现层，用于调用业务层
 */
public class MyTest {
    public static void main(String[] args) {
        //获取核心容器对象
        ApplicationContext as = new ClassPathXmlApplicationContext("bean.xml");
        //获取bean对象
        AccountService accountService = (AccountService) as.getBean("accountService");
        AccoutDao accoutDao = (AccoutDao) as.getBean("accountDao");
        System.out.println(accountService);
        System.out.println(accoutDao);

    }
}
