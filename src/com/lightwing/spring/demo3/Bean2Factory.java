package com.lightwing.spring.demo3;

/**
 * Bean2的静态工厂
 *
 * @author Lightwing Ng
 */
public class Bean2Factory {
	public static Bean2 createBean2(){
		System.out.println("Bean2Factory is executed");
		return new Bean2();
	}
}
