package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass09 {
    protected void display() {
        System.out.println("Protected access modifier - Accessible within the package and subclasses.");
    }
}

public class Test04ProtectedAccess extends Superclass09 {
    public static void main(String[] args) {
    	Test04ProtectedAccess obj = new Test04ProtectedAccess();
        obj.display(); // Outputs: Protected access modifier - Accessible within the package and subclasses.
    }
}
