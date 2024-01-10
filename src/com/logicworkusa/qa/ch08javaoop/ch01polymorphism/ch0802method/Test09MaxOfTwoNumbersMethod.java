package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test09MaxOfTwoNumbersMethod {
    public int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        Test09MaxOfTwoNumbersMethod num = new Test09MaxOfTwoNumbersMethod();
        int result = num.findMax(8, 12);
        System.out.println("Maximum Number: " + result); // Outputs: Maximum Number: 12
    }
}
