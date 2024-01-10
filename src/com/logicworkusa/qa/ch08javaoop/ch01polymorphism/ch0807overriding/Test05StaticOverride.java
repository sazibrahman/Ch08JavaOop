package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass05 {
    static void display() {
        System.out.println("Parent class method");
    }
}

class Test05StaticOverride extends SuperClass05 {
    // Won't compile - static method can't be overridden
    // void display() {
    //     System.out.println("Subclass method (Overridden)");
    // }
}
