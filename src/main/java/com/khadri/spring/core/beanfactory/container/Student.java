package com.khadri.spring.core.beanfactory.container;

public class Student {
    private int stdId;
    private String stdName;

    public Student(int stdId, String stdName) {
        this.stdId = stdId;
        this.stdName = stdName;
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }
}
