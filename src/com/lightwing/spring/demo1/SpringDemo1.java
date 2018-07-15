package com.lightwing.spring.demo1;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Spring的入门
 *
 * @author Lightwing Ng
 */
public class SpringDemo1 {
    @Test
    public void demo1() {
        UserDAOImpl userDAO = new UserDAOImpl();
        userDAO.setName("Lightwing Ng");
        userDAO.save();
    }

    @Test
    public void demo2() {
        // 创建 Spring 的工厂
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        userDAO.save();
    }

    @Test
    public void demo3() {
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("/Users/lightwingng/Desktop/Spring_Day_01/src");
        UserDAO userDAO = (UserDAO) applicationContext.getBean("userDAO");
        userDAO.save();
    }
}
