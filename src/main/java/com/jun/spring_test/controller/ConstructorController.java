package com.jun.spring_test.controller;


public class ConstructorController {

    public ConstructorController(ConstructorTest test) {
        System.out.println(test.result());
    }
}
