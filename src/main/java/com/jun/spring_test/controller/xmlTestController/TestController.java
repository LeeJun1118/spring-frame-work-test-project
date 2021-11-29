package com.jun.spring_test.controller.xmlTestController;


import com.jun.spring_test.controller.xmlTest.ConstructorTest;
import com.jun.spring_test.controller.xmlTest.PropertyListTest;
import com.jun.spring_test.controller.xmlTest.PropertySetTest;
import com.jun.spring_test.controller.xmlTest.PropertyTest;

public class TestController {

    public TestController(ConstructorTest test) {
        System.out.println("ConstructorTest : " + test.getResult());
    }

    public TestController(PropertyTest propertyTest) {
        System.out.println(propertyTest.getResult());
    }

    public TestController(PropertyListTest propertyListTest) {
        System.out.println(propertyListTest.getResultList().toString());
    }

    public TestController(PropertySetTest propertySetTest) {
        System.out.println(propertySetTest.getResult().toString());
    }
}
