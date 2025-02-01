package com.broadfaster.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/broadfaster/sterotype/config.xml");

//        the bean will be created by IOC as per the class name with camel case
        Student student1 = context.getBean("student2", Student.class);

        System.out.println(student1);

    }

}
