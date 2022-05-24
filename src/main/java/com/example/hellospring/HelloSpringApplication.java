package com.example.hellospring;

import com.example.hellospring.beans.*;
import com.example.hellospring.controller.UserController;
import com.example.hellospring.dao.UserDao;
import com.example.hellospring.dao.iOrderDao;
import com.example.hellospring.dao.impl.OrderDaoImpl;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApplication {
  private static final Log LOGGER = LogFactory.getLog(HelloSpringApplication.class);

  public static <OrderDao> void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Beans2.xml");
    //获取代理对象
    UserDao userDao = context.getBean("userDao", UserDao.class);
    //获取代理对象
    iOrderDao orderDao = context.getBean("orderDao", iOrderDao.class);
    //调用 UserDao 中的各个方法
    userDao.add();
    userDao.delete();
    userDao.modify();
    userDao.get();
    //调用 OrderDao 中的各个方法
    orderDao.add();
    orderDao.adds();
    orderDao.delete();
    orderDao.get();
    orderDao.modify();
  }


}
