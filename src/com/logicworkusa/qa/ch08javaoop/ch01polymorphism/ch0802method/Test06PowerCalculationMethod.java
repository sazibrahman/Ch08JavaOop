package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test06PowerCalculationMethod {
    public double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        Test06PowerCalculationMethod math = new Test06PowerCalculationMethod();
        double result = math.calculatePower(2.0, 3);
        System.out.println("Result: " + result); // Outputs: Result: 8.0
    }
}
