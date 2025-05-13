package com.varver.task_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Task1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Task1Application.class, args);
        System.out.println("qwert");
    }
}
