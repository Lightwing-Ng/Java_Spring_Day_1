package com.lightwing.spring.demo3;

/**
 * Bean3 的实例工厂
 *
 * @author Lightwing Ng
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3Factory is executed");
        return new Bean3();
    }
}
