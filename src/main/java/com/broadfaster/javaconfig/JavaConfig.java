package com.broadfaster.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = {"akshat", "mybean"})
    public Student getStudent() {
        return new Student();
    }

}
