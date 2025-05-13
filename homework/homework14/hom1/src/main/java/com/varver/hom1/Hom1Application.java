package com.varver.hom1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Hom1Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Hom1Application.class, args);
        System.out.println("qwert");
    }
}
