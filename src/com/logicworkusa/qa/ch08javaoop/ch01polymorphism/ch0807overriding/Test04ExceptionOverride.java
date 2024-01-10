package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;
import java.io.IOException;

class SuperClass04 {
    void display() throws IOException {
        System.out.println("Parent class method");
    }
}

class Test04ExceptionOverride extends SuperClass04 {
    // Allowed to throw a more specific exception or no exception at all
    void display() throws ArrayIndexOutOfBoundsException {
        System.out.println("Subclass method (Overridden)");
    }
}
