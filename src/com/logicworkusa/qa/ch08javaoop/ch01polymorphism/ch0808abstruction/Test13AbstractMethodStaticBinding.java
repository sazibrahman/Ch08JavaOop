package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass13 {
    abstract void display();

    static void staticMethod() {
        System.out.println("Static method in abstract class");
    }
}

class Subclass13 extends Superclass13 {
    void display() {
        System.out.println("Subclass method");
    }
}

class Test13AbstractMethodStaticBinding {
    public static void main(String[] args) {
    	Superclass13 obj = new Subclass13();
        obj.display(); // Outputs: Subclass method
        obj.staticMethod(); // Outputs: Static method in abstract class
        
        Superclass13.staticMethod();
    }
}
