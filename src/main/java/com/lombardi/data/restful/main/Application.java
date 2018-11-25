package com.lombardi.data.restful.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.lombardi.data.restful")
@EntityScan("com.lombardi.data.restful.model")
@EnableJpaRepositories("com.lombardi.data.restful.repo")
public class Application {


    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
