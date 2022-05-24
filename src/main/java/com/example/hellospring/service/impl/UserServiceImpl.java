package com.example.hellospring.service.impl;

import com.example.hellospring.dao.UserDao;
import com.example.hellospring.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("userService")
public class UserServiceImpl implements UserService {
  @Resource
  private UserDao userDao;
  public UserDao getUserDao() {
    return userDao;
  }
  public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
  }
  @Override
  public void out() {
//    userDao.print();
    System.out.println("一个精美而实用的网站");
  }
}
