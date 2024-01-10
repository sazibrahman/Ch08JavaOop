package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class SuperClass04 {
    void display() {
        System.out.println("Parent class method");
    }
}

class Subclass04 extends SuperClass04 {
    void display() {
        System.out.println("Subclass 1 method");
    }
}

class AnotherSubclass04 extends SuperClass04 {
    void display() {
        System.out.println("Subclass 2 method");
    }
}

class Test04DynamicMethodDispatch {
    public static void main(String[] args) {
    	SuperClass04 obj1 = new Subclass04();
    	SuperClass04 obj2 = new AnotherSubclass04();
        obj1.display(); // Outputs: Subclass 1 method
        obj2.display(); // Outputs: Subclass 2 method
    }
}
