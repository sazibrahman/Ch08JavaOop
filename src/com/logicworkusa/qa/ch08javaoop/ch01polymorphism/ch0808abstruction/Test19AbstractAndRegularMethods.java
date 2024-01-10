package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass19 {
    abstract void display();

    void regularMethod() {
        System.out.println("Regular method in abstract class");
    }
}

class Subclass19 extends Superclass19 {
    void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test19AbstractAndRegularMethods {
    public static void main(String[] args) {
        Subclass19 obj = new Subclass19();
        obj.display();       // Outputs: Abstract method implementation in subclass
        obj.regularMethod(); // Outputs: Regular method in abstract class
    }
}
