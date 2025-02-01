package com.broadfaster.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class StudentUsingAnnotation {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("init method using annotation");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("destroy method using annotation");
    }

    @Override
    public String toString() {
        return "StudentUsingAnnotation{" +
                "name='" + name + '\'' +
                '}';
    }
}
