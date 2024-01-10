package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test01DefaultConstructor {
    Test01DefaultConstructor() {
        System.out.println("Default Constructor initialized.");
    }

    public static void main(String[] args) {
        Test01DefaultConstructor obj = new Test01DefaultConstructor(); // Outputs: Default Constructor initialized.
    }
}
