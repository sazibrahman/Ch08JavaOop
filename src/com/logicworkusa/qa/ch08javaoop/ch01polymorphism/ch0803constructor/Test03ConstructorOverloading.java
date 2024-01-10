package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0803constructor;

public class Test03ConstructorOverloading {
    int value;

    Test03ConstructorOverloading() {
        this.value = 0;
        System.out.println("Default Constructor initialized.");
    }

    Test03ConstructorOverloading(int val) {
        this.value = val;
        System.out.println("Parameterized Constructor initialized with value: " + val);
    }

    public static void main(String[] args) {
        Test03ConstructorOverloading obj1 = new Test03ConstructorOverloading(); // Outputs: Default Constructor initialized.
        Test03ConstructorOverloading obj2 = new Test03ConstructorOverloading(10); // Outputs: Parameterized Constructor initialized with value: 10
    }
}
