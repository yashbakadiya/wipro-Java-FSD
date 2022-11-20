package com.trainingapps.didemo;

public class Rectangle implements IShape{

    private int length;
    private int breadth;

    public Rectangle(){

    }
    public Rectangle(int len, int breadth){
        this.length = len;
        this.breadth=breadth;
    }

    @Override
    public int area(){
        return length*breadth;
    }
}
