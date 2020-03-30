package com.zhaoxin.spring.service;

import com.zhaoxin.spring.dao.AccoutDao;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.logging.XMLFormatter;

public class AppAddBeanFactory {
    public static void main(String[] args) {
        /**
         *  ApplicationContext: 适用单例
         *  创建对象采取的策略是立即加载，读取完配置文件即创建
         *
         *  BeanFactory:多例
         *  延迟加载，使用到才创建
         *
         */
//        ApplicationContext as = new FileSystemXmlApplicationContext("E:\\demoTest\\spring\\src\\main\\resources\\bean.xml");
//        AccountService accountService = (AccountService) as.getBean("accountService");
//        AccoutDao accoutDao = (AccoutDao) as.getBean("accountDao");
//        System.out.println(accountService);
//        System.out.println(accoutDao);


//        ===========================
        Resource resource = new ClassPathResource("bean.xml");
        BeanFactory beanFactory = new XmlBeanFactory(resource);
        AccountService accountService = (AccountService) beanFactory.getBean("accountService");
        System.out.println(accountService);
    }
}
