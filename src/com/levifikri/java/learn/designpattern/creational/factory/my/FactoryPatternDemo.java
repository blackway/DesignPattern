package com.levifikri.java.learn.designpattern.creational.factory.my;

public class FactoryPatternDemo {
    public static void main(String[] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call craw method of Circle
        shape1.draw();
        
    }
   
}
