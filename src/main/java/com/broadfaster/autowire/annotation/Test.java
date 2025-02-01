package com.broadfaster.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/broadfaster/autowire/annotation/config.xml");

        Student st1 = context.getBean("student1", Student.class);

        System.out.println(st1);
    }

}
