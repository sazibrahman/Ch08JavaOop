package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass04 {
	Superclass04() {
        System.out.println("Abstract class constructor");
    }

    abstract void display();
}

class Subclass04 extends Superclass04 {
	Subclass04() {
        System.out.println("Subclass constructor");
    }

    void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test04AbstractConstructor {
    public static void main(String[] args) {
    	Subclass04 obj = new Subclass04();
        obj.display(); // Outputs: Abstract method implementation in subclass
    }
}
