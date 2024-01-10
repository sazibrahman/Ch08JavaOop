package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
abstract class Shape {
    abstract double area();
}

class Circle extends Shape {
    double radius;
    
    Circle(double r) {
        radius = r;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

class Square extends Shape {
    double side;
    
    Square(double s) {
        side = s;
    }
    
    @Override
    double area() {
        return side * side;
    }
}

public class Test08ShapeExample {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        
        System.out.println("Area of Circle: " + circle.area()); // Outputs: Area of Circle: 78.53981633974483
        System.out.println("Area of Square: " + square.area()); // Outputs: Area of Square: 16.0
    }
}
