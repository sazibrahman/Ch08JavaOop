package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class AClass01 {
    void add(int a, int b) {
        System.out.println("Sum of two integers: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum of two doubles: " + (a + b));
    }
}

class Test01MethodOverloading {
    public static void main(String[] args) {
    	AClass01 obj = new AClass01();
        obj.add(5, 10);        // Outputs: Sum of two integers: 15
        obj.add(5.5, 10.5);    // Outputs: Sum of two doubles: 16.0
    }
}
