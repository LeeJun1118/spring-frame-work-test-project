package com.jun.spring_test.controller.xmlTestController;

import com.jun.spring_test.controller.xmlTest.PropertyListTest;
import com.jun.spring_test.controller.xmlTest.PropertyTest;


public class TestController2 {

    public TestController2(PropertyListTest propertyRefListTest) {
        for (PropertyTest propertyTest : propertyRefListTest.getRefResultList()){
            System.out.println("Ref Property List : " + propertyTest.getResult());
        }
    }
}
