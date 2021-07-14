package com.fundamentos.springboot.bean.implementation;

import com.fundamentos.springboot.bean.MyBean;

public class MyBeanImpl implements MyBean {

    @Override
    public String hello() {
        return "Hello from my BeanImpl";
    }
}
