package com.jun.spring_test.controller;


public class Test {
    String resultValue;

    public Test(String resultValue) {
        this.resultValue = resultValue;
    }

    public String result(){
        return "My Result Value : " + resultValue ;
    }

}
