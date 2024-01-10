package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass01 {
    void display() {
        System.out.println("Parent class method");
    }
}

class SubClass01 extends SuperClass01 {
    void display() {
        System.out.println("Subclass method (Overridden)");
    }
}

class Test01BasicMethodOverriding {
    public static void main(String[] args) {
    	SubClass01 obj = new SubClass01();
        obj.display(); // Outputs: Subclass method (Overridden)
    }
}
