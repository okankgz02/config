package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.dao.AccountDAO;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

  // burdaki amaç tek bir pointcut ile dao sınıfındaki tüm class ve metotların öncesinde çalışabilme
  @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
  private void forDaoPackage() {}

  @Before("forDaoPackage()")
  public void beforeAddAccountAdvice() {
    System.out.println("beforeAddAccountAdvice methodu çalıştı");
  }

  @Before("forDaoPackage()")
  public void performApiAnalytics() {
    System.out.println("performApiAnalytics methodu çalıştı");

  }
  @After("forDaoPackage()")
  public void after() {
    System.out.println("**************");

  }

}
