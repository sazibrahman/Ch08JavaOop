package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass09 {
    final void display() {
        System.out.println("Parent class final method");
    }
}

class Test09FinalMethodOverride extends SuperClass09 {
    // Won't compile - final method cannot be overridden
    // void display() {
    //     System.out.println("Subclass method (Overridden)");
    // }
}
