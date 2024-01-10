package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class AClass05 {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Test05CompileTimePolymorphism {
    public static void main(String[] args) {
    	AClass05 obj = new AClass05();
        System.out.println("Sum of two integers: " + obj.add(5, 10));         // Outputs: Sum of two integers: 15
        System.out.println("Sum of three integers: " + obj.add(5, 10, 15));   // Outputs: Sum of three integers: 30
    }
}

