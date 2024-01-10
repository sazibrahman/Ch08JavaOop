package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test05CircleAreaCalculationMethod {
    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Test05CircleAreaCalculationMethod geo = new Test05CircleAreaCalculationMethod();
        double area = geo.calculateCircleArea(5.0);
        System.out.println("Circle Area: " + area); // Outputs: Circle Area: 78.53981633974483
    }
}
