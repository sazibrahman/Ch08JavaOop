package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class SuperClass02 {
    void display() {
        System.out.println("Parent class method");
    }
}

class Subclass02 extends SuperClass02 {
    void display() {
        System.out.println("Subclass method (Overridden)");
    }
}

class Test02MethodOverriding {
    public static void main(String[] args) {
    	Subclass02 obj = new Subclass02();
        obj.display(); // Outputs: Subclass method (Overridden)
    }
}
