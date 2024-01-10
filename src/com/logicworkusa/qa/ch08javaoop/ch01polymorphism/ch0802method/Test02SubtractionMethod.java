package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test02SubtractionMethod {
    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        Test02SubtractionMethod math = new Test02SubtractionMethod();
        int result = math.subtract(10, 4);
        System.out.println("Subtraction Result: " + result); // Outputs: Subtraction Result: 6
    }
}
