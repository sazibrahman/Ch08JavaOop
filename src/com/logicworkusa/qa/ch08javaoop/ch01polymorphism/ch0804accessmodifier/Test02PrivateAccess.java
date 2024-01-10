package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

public class Test02PrivateAccess {
    private void display() {
        System.out.println("Private access modifier - Accessible within the class only.");
    }

    public static void main(String[] args) {
        Test02PrivateAccess obj = new Test02PrivateAccess();
        // Won't compile - private method is not accessible outside the class
        // obj.display();
    }
}
