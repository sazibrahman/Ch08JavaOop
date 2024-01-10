package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test07InitializationThroughConstructor {
    int value;

    Test07InitializationThroughConstructor() {
        initialize();
    }

    void initialize() {
        this.value = 50;
        System.out.println("Initialized value through constructor: " + value);
    }

    public static void main(String[] args) {
        Test07InitializationThroughConstructor obj = new Test07InitializationThroughConstructor(); // Outputs: Initialized value through constructor: 50
    }
}
