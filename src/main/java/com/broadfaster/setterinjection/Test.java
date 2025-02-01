package com.broadfaster.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/broadfaster/setterinjection/config.xml");
        Student st1 = (Student) context.getBean("student1");

        Student st3 = (Student) context.getBean("student3");

        System.out.println(st1);

        System.out.println("another one");

        System.out.println(st3);




    }
}
