package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test04ConstructorChaining {
    int value;

    Test04ConstructorChaining() {
        this(100); // Calls another constructor
        System.out.println("Default Constructor initialized.");
    }

    Test04ConstructorChaining(int val) {
        this.value = val;
        System.out.println("Parameterized Constructor initialized with value: " + val);
    }

    public static void main(String[] args) {
        Test04ConstructorChaining obj = new Test04ConstructorChaining(); // Outputs: Parameterized Constructor initialized with value: 100, Default Constructor initialized.
    }
}
