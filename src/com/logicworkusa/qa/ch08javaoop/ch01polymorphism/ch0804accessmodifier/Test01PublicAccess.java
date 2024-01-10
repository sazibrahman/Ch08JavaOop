package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

public class Test01PublicAccess {
    public void display() {
        System.out.println("Public access modifier - Anyone can access.");
    }

    public static void main(String[] args) {
        Test01PublicAccess obj = new Test01PublicAccess();
        obj.display(); // Outputs: Public access modifier - Anyone can access.
    }
}
