package com.example.hellospring;

import com.example.hellospring.beans.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class HelloSpringApplication {
  private static final Log LOGGER = LogFactory.getLog(HelloSpringApplication.class);

  public static void main(String[] args) {

    ApplicationContext context = new FileSystemXmlApplicationContext("classpath:/Beans.xml");
    HelloWorld hObj = (HelloWorld) context.getBean( "helloWorld",HelloWorld.class);
    hObj.getMessage();
    Grade h = (Grade) context.getBean("grade",Grade.class);
    h.toString();
    Student s = (Student) context.getBean("student",Student.class);
    s.toString();
    //获取名为 employee 的 Bean
    Employee employee = context.getBean("employee", Employee.class);
    //通过日志打印信息
    LOGGER.info(employee.toString());

    JavaCollection javaCollection = context.getBean("javaCollection", JavaCollection.class);
    //通过日志打印员工信息
    LOGGER.info(javaCollection.toString());

    SingletonBean singletonBean = context.getBean("singletonBean", SingletonBean.class);
    SingletonBean singletonBean2 = context.getBean("singletonBean", SingletonBean.class);
    System.out.println(singletonBean);
    System.out.println(singletonBean2);

    PrototypeBean prototypeBean = context.getBean("prototypeBean", PrototypeBean.class);
    PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
    System.out.println(prototypeBean);
    System.out.println(prototypeBean2);
  }


}
