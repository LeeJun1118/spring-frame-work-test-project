package com.jun.spring_test.controller.xmlTestController;


import com.jun.spring_test.controller.xmlTest.ConstructorTest;
import com.jun.spring_test.controller.xmlTest.PropertyListTest;
import com.jun.spring_test.controller.xmlTest.PropertyTest;

public class TestController {

    public TestController(ConstructorTest test) {
        System.out.println(test.result());
    }

    public TestController(PropertyTest propertyTest) {
        propertyTest.getResult();
    }

    public TestController(PropertyListTest propertyListTest) {
        System.out.println(propertyListTest.getResultList().toString());
    }
}
