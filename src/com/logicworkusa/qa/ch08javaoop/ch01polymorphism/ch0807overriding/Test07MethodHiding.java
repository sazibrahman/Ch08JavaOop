package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass07 {
    static void display() {
        System.out.println("Parent class method");
    }
}

class SubClass07 extends SuperClass07 {
    // Hides the static method in the parent class
    static void display() {
        System.out.println("Subclass method (Hiding)");
    }
}

class Test07MethodHiding {
    public static void main(String[] args) {
    	SubClass07.display(); // Outputs: Subclass method (Hiding)
    }
}
