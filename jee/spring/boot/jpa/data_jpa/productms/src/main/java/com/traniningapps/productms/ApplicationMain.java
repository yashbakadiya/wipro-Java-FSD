package com.traniningapps.productms;

import com.traniningapps.productms.ui.FrontEnd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class ApplicationMain {

    public static void main(String args[]){
        ApplicationContext context= SpringApplication.run(ApplicationMain.class,args);
        FrontEnd frontEnd=context.getBean(FrontEnd.class);
        frontEnd.runUI();
    }
}
