package com.lightwing.spring.demo2;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo2 {
    // 声命周期的配置
    @Test
    public void demo1() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext
                ("applicationContext.xml");
        CustomerDAO customerDAO = (CustomerDAO) applicationContext.getBean("customerDAO");
        customerDAO.save();
        applicationContext.close();
    }

    // Bean 的作用范围配置
    @Test
    public void demo2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerDAO customerDAO1 = (CustomerDAO) applicationContext.getBean("customerDAO");
        System.out.println(customerDAO1);
        CustomerDAO customerDAO2 = (CustomerDAO) applicationContext.getBean("customerDAO");
        System.out.println(customerDAO2);
        System.out.println(customerDAO1 == customerDAO2);
        applicationContext.close();
    }
}
