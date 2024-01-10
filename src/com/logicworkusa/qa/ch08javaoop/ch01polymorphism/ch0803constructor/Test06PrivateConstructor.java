package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test06PrivateConstructor {
    private Test06PrivateConstructor() {
        System.out.println("Private Constructor initialized.");
    }

    public static void main(String[] args) {
        // Can't directly access private constructor - will cause compilation error
        // Test06PrivateConstructor obj = new Test06PrivateConstructor();
    }
}
