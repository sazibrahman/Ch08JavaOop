package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass06 {
	SuperClass06() {
        System.out.println("Abstract class constructor");
    }

    abstract void display();
}

class Subclass06 extends SuperClass06 {
	Subclass06() {
        System.out.println("Subclass constructor");
    }

    void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test06AbstractionWithConstructor {
    public static void main(String[] args) {
    	Subclass06 obj = new Subclass06();
        obj.display(); // Outputs: Abstract method implementation in subclass
    }
}
