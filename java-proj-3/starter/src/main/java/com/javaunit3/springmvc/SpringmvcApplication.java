package com.javaunit3.springmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringmvcApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(SpringmvcApplication.class, args);
        System.out.println("Spring boot application is started..");
    }
}
