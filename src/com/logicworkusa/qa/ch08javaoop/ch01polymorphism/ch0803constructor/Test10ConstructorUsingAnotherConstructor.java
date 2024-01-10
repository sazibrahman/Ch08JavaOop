package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test10ConstructorUsingAnotherConstructor {
    int value;

    Test10ConstructorUsingAnotherConstructor() {
        this(50); // Calls another constructor
        System.out.println("Default Constructor initialized.");
    }

    Test10ConstructorUsingAnotherConstructor(int val) {
        this.value = val;
        System.out.println("Parameterized Constructor initialized with value: " + val);
    }

    public static void main(String[] args) {
        Test10ConstructorUsingAnotherConstructor obj = new Test10ConstructorUsingAnotherConstructor(); // Outputs: Parameterized Constructor initialized with value: 50, Default Constructor initialized.
    }
}
