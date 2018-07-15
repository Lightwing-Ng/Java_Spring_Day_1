package com.lightwing.spring.demo2;

public class CustomerDAOImpl implements CustomerDAO {
    public void setup() {
        System.out.println("CustomerDAOImpl is initialized");
    }

    @Override
    public void save() {
        System.out.println("CustomerDAOImpl: save() has been executed");
    }

    public void destroy() {
        System.out.println("CustomerDAOImpl is destroyed");
    }
}
