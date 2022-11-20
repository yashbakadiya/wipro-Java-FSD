package com.trainingapps.demo;


import com.trainingapps.demo.frontend.FrontEnd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * 1) @Configuration
 * 2)@ComponentScan
 * 3)EnableAutoConfiguration
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        FrontEnd frontEnd = context.getBean(FrontEnd.class);
        frontEnd.runUI();
    }

}
