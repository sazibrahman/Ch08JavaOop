package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

interface AnInterface08 {
    void display(); // Abstract method in interface
}

abstract class AClass08 implements AnInterface08 {
    public void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test08AbstractionWithInterface {
    public static void main(String[] args) {
    	AClass08 obj = new AClass08() {}; // Creating an anonymous subclass instance
        obj.display(); // Outputs: Abstract method implementation in subclass
    }
}
