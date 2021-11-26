package com.jun.spring_test.controller;


public class TestController {

    public TestController(ConstructorTest test) {
        System.out.println(test.result());
    }

    public TestController(PropertyTest propertyTest) {
        propertyTest.getResult();
    }
}
