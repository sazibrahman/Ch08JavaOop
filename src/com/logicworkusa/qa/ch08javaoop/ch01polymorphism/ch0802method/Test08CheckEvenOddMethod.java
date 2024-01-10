package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test08CheckEvenOddMethod {
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Test08CheckEvenOddMethod num = new Test08CheckEvenOddMethod();
        System.out.println("Is 10 even? " + num.isEven(10)); // Outputs: Is 10 even? true
        System.out.println("Is 7 even? " + num.isEven(7)); // Outputs: Is 7 even? false
    }
}
