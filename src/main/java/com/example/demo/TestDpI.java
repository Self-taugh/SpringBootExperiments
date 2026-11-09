package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestDpI {

    private String container;

    public TestDpI(){
        this.container = "Test";
    }
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }
}
