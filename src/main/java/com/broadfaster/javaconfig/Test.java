package com.broadfaster.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {


    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Student st1 = context.getBean("mybean", Student.class);

        System.out.println(st1);
    }

}
