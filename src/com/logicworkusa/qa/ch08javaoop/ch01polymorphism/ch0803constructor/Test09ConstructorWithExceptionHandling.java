package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test09ConstructorWithExceptionHandling {
    int value;

    Test09ConstructorWithExceptionHandling(int divisor) {
        try {
            value = 100 / divisor;
            System.out.println("Value initialized: " + value);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Test09ConstructorWithExceptionHandling obj1 = new Test09ConstructorWithExceptionHandling(4); // Outputs: Value initialized: 25
        Test09ConstructorWithExceptionHandling obj2 = new Test09ConstructorWithExceptionHandling(0); // Outputs: Cannot divide by zero.
    }
}
