package com.zhaoxin.spring.Utils;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logger")
@Aspect
public class Logger {

    @Pointcut("execution( * *..*.*(..))")
    private void ptl() {
    }

    @Before("ptl()")
    public void printLog() {
        System.out.println("printLog  begin");
    }

    @AfterReturning
    public void afterPrintLog() {
        System.out.println("printLog  after");
    }

    @AfterThrowing
    public void throwPrintLog() {
        System.out.println("printLog  throw");
    }

    @After("ptl()")
    public void finalPrintLog() {
        System.out.println("printLog final");
    }
}
