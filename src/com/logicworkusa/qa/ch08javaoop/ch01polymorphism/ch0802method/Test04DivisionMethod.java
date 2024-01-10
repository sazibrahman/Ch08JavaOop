package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test04DivisionMethod {
    public double divide(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN; // Not a Number
        }
    }

    public static void main(String[] args) {
        Test04DivisionMethod math = new Test04DivisionMethod();
        double result = math.divide(20.0, 4.0);
        System.out.println("Division Result: " + result); // Outputs: Division Result: 5.0
    }
}
