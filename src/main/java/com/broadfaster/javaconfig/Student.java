package com.broadfaster.javaconfig;

import org.springframework.beans.factory.annotation.Value;

public class Student {

    @Value("Akshat Bhai")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
