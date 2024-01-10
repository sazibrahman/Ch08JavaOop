package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test08DefaultValuesConstructor {
    int value;

    Test08DefaultValuesConstructor() {
        System.out.println("Constructor initialized.");
        // Integer default value is 0
        System.out.println("Value: " + value); // Outputs: Value: 0
    }

    public static void main(String[] args) {
        Test08DefaultValuesConstructor obj = new Test08DefaultValuesConstructor(); // Outputs: Constructor initialized.
    }
}
