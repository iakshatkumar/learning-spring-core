package com.broadfaster.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

//        we are requesting spring ioc to give us student object as by default it has singleton scope one object will be returned each time we request.
        Student st1 = context.getBean("student", Student.class);
        Student st2 = context.getBean("student", Student.class);

        System.out.println("student1 = " + st1 + " HASHCODE : " + st1.hashCode());
        System.out.println("student2 = " + st2 + " HASHCODE : " + st2.hashCode());

        Student st3 = context.getBean("student3", Student.class);

        System.out.println("student3 = " + st3 + " HASHCODE : " + st3.hashCode());
    }

}
