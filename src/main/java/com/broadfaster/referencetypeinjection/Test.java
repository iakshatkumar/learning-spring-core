package com.broadfaster.referencetypeinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/broadfaster/referencetypeinjection/config.xml");

        Student st1 = (Student) context.getBean("student1");

        System.out.println(st1);


    }

}
