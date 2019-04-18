package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MemberShipDAO {

  public boolean addsSillyMember() {
    System.out.println(" addSillyMember calıstı");
    return true;
  }

  public void goToSleep(){
    System.out.println("go to sleep...");
  }
}
