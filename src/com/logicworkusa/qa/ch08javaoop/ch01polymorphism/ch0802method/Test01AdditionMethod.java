package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test01AdditionMethod {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Test01AdditionMethod math = new Test01AdditionMethod();
        int result = math.add(5, 3);
        System.out.println("Addition Result: " + result); // Outputs: Addition Result: 8
    }
}
