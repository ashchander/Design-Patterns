package com.github.ashchander.DesignPatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class DesignPatterns extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DesignPatterns.class);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(DesignPatterns.class, args);
    }
}
