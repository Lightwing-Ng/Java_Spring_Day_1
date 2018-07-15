package com.lightwing.spring.demo4;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 属性注入的方式：
 *
 * @author Lightwing Ng
 */
public class SpringDemo4 {
    // 构造方法方式的属性注入
    @Test
    public void demo1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car car = (Car) applicationContext.getBean("car");
        System.out.println(car);
    }

    // set 方法方式的属性注入
    @Test
    public void demo2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Car2 car2 = (Car2) applicationContext.getBean("car2");
        System.out.println(car2);
    }

    // set 方法注入对象类型
    @Test
    public void demo3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee);
    }
}
