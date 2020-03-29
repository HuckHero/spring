package com.zhaoxin.spring.service;

import com.zhaoxin.spring.dao.AccoutDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MyApplication {
    /*
    applicationContext的三个常用实现类
        classPathXmlApplicationcontext:加载类路径下的配置文件，要求配置文件必须在类路径下
        FileSystemXmlApplicationContext:磁盘任意位置的配置文件（权限要求）
        AnnotationConfigApplicationContext:
     */
    public static void main(String[] args) {
        ApplicationContext as = new FileSystemXmlApplicationContext("E:\\demoTest\\spring\\src\\main\\resources\\bean.xml");
        AccountService accountService = (AccountService) as.getBean("accountService");
        AccoutDao accoutDao = (AccoutDao) as.getBean("accountDao");
        System.out.println(accountService);
        System.out.println(accoutDao);
    }
}
