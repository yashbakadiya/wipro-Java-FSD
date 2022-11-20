package com.trainingapps.didemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Scope("prototype")
@Component
public class Canvas {
    @Autowired
    private IShape shape;

    public Canvas() {
        System.out.println("inside canvas empty constructor");
    }


    public Canvas(IShape shape) {
        this.shape = shape;
        System.out.println("inside canvas shape constructor");
    }


    public void setShape(IShape shape) {
        this.shape = shape;
    }

    public void drawShape() {
        int area = shape.area();
        System.out.println("drawing shape "+shape.getClass().getName());
        System.out.println("drawing shape with area=" + area);
    }

}
