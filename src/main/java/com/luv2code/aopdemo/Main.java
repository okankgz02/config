package com.luv2code.aopdemo;

import com.luv2code.aopdemo.Model.Account;
import com.luv2code.aopdemo.config.DemoConfig;
import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MemberShipDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {

    // read spring config java class
    AnnotationConfigApplicationContext context =
        new AnnotationConfigApplicationContext(DemoConfig.class);

    // get the bean from spring container
    AccountDAO theAccountDAO = context.getBean("accountDAO", AccountDAO.class);

    MemberShipDAO theMemberShipDao = context.getBean("memberShipDAO", MemberShipDAO.class);
    // call the business method

    Account account = new Account();
    theAccountDAO.addAccount(account, true);
    theAccountDAO.doWork();

    theMemberShipDao.addsSillyMember();
    theMemberShipDao.goToSleep();

    // call the business method again
    theMemberShipDao.addsSillyMember();

    // close the context
    context.close();
  }
}
