package com.example.hellospring;

import com.example.hellospring.beans.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class HelloSpringApplication {
  private static final Log LOGGER = LogFactory.getLog(HelloSpringApplication.class);

  public static void main(String[] args) {

    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/Beans.xml");
    Employee employee = context.getBean("employee", Employee.class);
    System.out.println(employee);
  }


}
