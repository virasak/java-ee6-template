package com.virasak.quickstart.web.bean;

import javax.inject.Named;


@Named
public class TestBean {

    public String getGreetingString() {
        return "Hello World from TestBean";
    }
}

