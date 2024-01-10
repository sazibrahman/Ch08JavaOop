package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

abstract class SuperClass10 {
    abstract void display();
}

class SubClass10 extends SuperClass10 {
    void display() {
        System.out.println("Subclass method (Overridden)");
    }
}

class Test10AbstractMethodOverride {
    public static void main(String[] args) {
    	SubClass10 obj = new SubClass10();
        obj.display(); // Outputs: Subclass method (Overridden)
    }
}
