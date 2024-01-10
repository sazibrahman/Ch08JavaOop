package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass10 {
    int value = 10; // Regular field in an abstract class

    abstract void display();
}

class Subclass10 extends SuperClass10 {
    void display() {
        System.out.println("Value: " + value);
    }
}

class Test10AbstractionWithFields {
    public static void main(String[] args) {
    	Subclass10 obj = new Subclass10();
        obj.display(); // Outputs: Value: 10
    }
}
