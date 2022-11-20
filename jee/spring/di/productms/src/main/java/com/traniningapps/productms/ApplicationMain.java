package com.traniningapps.productms;

import com.traniningapps.productms.ui.FrontEnd;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationMain {

    public static void main(String args[]){
        ApplicationContext context=new AnnotationConfigApplicationContext(JavaConfig.class);
        FrontEnd frontEnd=context.getBean(FrontEnd.class);
        frontEnd.runUI();
    }
}
