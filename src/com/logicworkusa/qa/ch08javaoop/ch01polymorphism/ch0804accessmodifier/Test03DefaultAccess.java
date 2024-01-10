package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

public class Test03DefaultAccess {
    void display() {
        System.out.println("Default access modifier - Accessible within the package.");
    }

    public static void main(String[] args) {
        Test03DefaultAccess obj = new Test03DefaultAccess();
        obj.display(); // Outputs: Default access modifier - Accessible within the package.
    }
}
