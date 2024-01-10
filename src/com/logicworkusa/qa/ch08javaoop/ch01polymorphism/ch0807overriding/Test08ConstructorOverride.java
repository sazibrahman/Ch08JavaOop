package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass08 {
	SuperClass08() {
        System.out.println("Parent class constructor");
    }
}

class SubClass08 extends SuperClass08 {
	SubClass08() {
        System.out.println("Subclass constructor (Overridden)");
    }
}

class Test08ConstructorOverride {
    public static void main(String[] args) {
        new SubClass08(); // Outputs: Parent class constructor, Subclass constructor (Overridden)
    }
}
