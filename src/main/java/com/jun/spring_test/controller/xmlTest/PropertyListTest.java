package com.jun.spring_test.controller.xmlTest;

import java.util.List;

public class PropertyListTest {

    private List<String> resultList;

    public List<String> getResultList() {
        return resultList;
    }

    public void setResultList(List<String> resultList) {
        this.resultList = resultList;
    }

    public void setResultListRef(List resultListRef) {
        this.resultList = resultListRef;
    }
}
