package com.jun.spring_test.controller.xmlTest;


public class ConstructorTest {
    String resultValue;

    public ConstructorTest(String resultValue) {
        this.resultValue = resultValue;
    }

    public String getResult(){
        return resultValue ;
    }

}
