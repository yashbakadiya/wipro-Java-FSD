package com.trainingapps.didemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

    public static void main(String args[]) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Canvas canvas1 =context.getBean(Canvas.class);
        canvas1.drawShape();
        Square square1 = context.getBean(Square.class);
        Square square2 = context.getBean("square",Square.class);
        boolean isSame=square1==square2;
        System.out.println("is same="+isSame);

    }
}
