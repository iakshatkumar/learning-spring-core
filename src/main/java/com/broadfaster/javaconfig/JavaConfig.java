package com.broadfaster.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {

//    by default the bean name will be same as method name in IOC container but we can specify explicitly
//    by default bean scope is singleton
    @Bean(name = {"akshat", "student"})
    @Scope("prototype")
    public Student getStudent() {
        return new Student();
    }

    @Bean(name = "student3")
    public Student getAnotherStudent() {
        return new Student();
    }

}
