package com.jmendoza.springboot.cleanarchitecture.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jmendoza.springboot.cleanarchitecture.*"})
public class CleanArchitectureApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(CleanArchitectureApplication.class, args);
    }

}
