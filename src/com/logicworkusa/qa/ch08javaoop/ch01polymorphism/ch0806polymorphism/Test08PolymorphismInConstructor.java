package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class SuperClass08 {
	SuperClass08() {
        System.out.println("Parent class constructor");
    }
}

class Subclass08 extends SuperClass08 {
	Subclass08() {
        System.out.println("Subclass constructor");
    }

	Subclass08(String msg) {
        System.out.println("Subclass constructor with message: " + msg);
    }
}

class Test08PolymorphismInConstructor {
    public static void main(String[] args) {
    	Subclass08 obj1 = new Subclass08();                    // Outputs: Parent class constructor, Subclass constructor
    	Subclass08 obj2 = new Subclass08("Hello Polymorphism"); // Outputs: Parent class constructor, Subclass constructor with message: Hello Polymorphism
    }
}
