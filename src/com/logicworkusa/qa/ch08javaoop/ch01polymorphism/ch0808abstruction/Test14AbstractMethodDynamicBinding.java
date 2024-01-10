package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass14 {
    abstract void display();
}

class Subclass14 extends Superclass14 {
    void display() {
        System.out.println("Subclass method");
    }
}

class Test14AbstractMethodDynamicBinding {
    public static void main(String[] args) {
    	Superclass14 obj = new Subclass14();
        obj.display(); // Outputs: Subclass method
    }
}
