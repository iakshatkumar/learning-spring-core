package com.broadfaster.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/com/broadfaster/lifecycle/config.xml");
//      without this hook IOC will not call the destroy method
        context.registerShutdownHook();

//        Employee employee1 = (Employee) context.getBean("emp1");
//        System.out.println(employee1);

//        Student st1 = (Student) context.getBean("student1");
//        System.out.println(st1);

        StudentUsingAnnotation studentUsingAnnotation1 = (StudentUsingAnnotation) context.getBean("studentUsingAnnotation1");
        System.out.println(studentUsingAnnotation1);
    }
}
