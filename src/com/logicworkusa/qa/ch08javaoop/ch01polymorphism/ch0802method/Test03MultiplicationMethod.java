package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test03MultiplicationMethod {
    public int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Test03MultiplicationMethod math = new Test03MultiplicationMethod();
        int result = math.multiply(6, 7);
        System.out.println("Multiplication Result: " + result); // Outputs: Multiplication Result: 42
    }
}
