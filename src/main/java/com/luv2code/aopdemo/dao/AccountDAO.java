package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Model.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

  public void addAccount(Account account, boolean vipFlag) {
    System.out.println(" AccountDAO run ");
  }

  public boolean doWork() {
    System.out.println("DoWork");
    return false;
  }
}
