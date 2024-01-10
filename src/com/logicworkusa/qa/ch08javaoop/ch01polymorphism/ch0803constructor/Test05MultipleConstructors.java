package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test05MultipleConstructors {
    int value;

    Test05MultipleConstructors() {
        this(0); // Calls another constructor
        System.out.println("Default Constructor initialized.");
    }

    Test05MultipleConstructors(int val) {
        this.value = val;
        System.out.println("Parameterized Constructor initialized with value: " + val);
    }

    Test05MultipleConstructors(String msg) {
        System.out.println("Constructor initialized with message: " + msg);
    }

    public static void main(String[] args) {
        Test05MultipleConstructors obj1 = new Test05MultipleConstructors(); // Outputs: Parameterized Constructor initialized with value: 0, Default Constructor initialized.
        Test05MultipleConstructors obj2 = new Test05MultipleConstructors("Hello!"); // Outputs: Constructor initialized with message: Hello!
    }
}
