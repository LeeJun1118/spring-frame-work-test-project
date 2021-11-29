package com.jun.spring_test.controller.xmlTest;

import java.util.List;

public class PropertyListTest {

    private List<String> resultList;
    private List<PropertyTest> refResultList;

    public List<String> getResultList() {
        return resultList;
    }

    public void setResultList(List<String> resultList) {
        this.resultList = resultList;
    }


    public List<PropertyTest> getRefResultList() {
        return refResultList;
    }

    public void setRefResultList(List<PropertyTest> setRefResultList) {
        this.refResultList = setRefResultList;
    }
}
