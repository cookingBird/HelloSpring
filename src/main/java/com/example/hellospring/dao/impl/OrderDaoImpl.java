package com.example.hellospring.dao.impl;

import com.example.hellospring.dao.iOrderDao;

public class OrderDaoImpl implements iOrderDao {

  public void add() {
    System.out.println("正在执行 UserDao 的 add() 方法……");
  }
  public void adds() {
    System.out.println("正在执行 iOrderDao 的 adds() 方法……");
  }
  public void delete() {
    System.out.println("正在执行 iOrderDao 的 delete() 方法……");
  }
  public void modify() {
    System.out.println("正在执行 iOrderDao 的 modify() 方法……");
  }
  public void get() {
    System.out.println("正在执行 iOrderDao 的 get() 方法……");
  }
}
