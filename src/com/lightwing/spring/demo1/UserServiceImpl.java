package com.lightwing.spring.demo1;

public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("UserService 执行了...");
    }
}
