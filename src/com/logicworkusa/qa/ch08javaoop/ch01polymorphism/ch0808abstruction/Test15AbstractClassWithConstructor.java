package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass15 {
	Superclass15() {
        System.out.println("Abstract class constructor");
    }

    abstract void display();
}

class Subclass15 extends Superclass15 {
	Subclass15() {
        System.out.println("Subclass constructor");
    }

    void display() {
        System.out.println("Subclass method");
    }
}

class Test15AbstractClassWithConstructor {
    public static void main(String[] args) {
    	Subclass15 obj = new Subclass15();
        obj.display(); // Outputs: Subclass method
    }
}
