package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass20 {
    final int value = 50; // Final variable in an abstract class

    abstract void display();
}

class Subclass20 extends Superclass20 {
    void display() {
        System.out.println("Value: " + value);
    }
}

class Test20AbstractWithFinalVariable {
    public static void main(String[] args) {
        Subclass20 obj = new Subclass20();
        obj.display(); // Outputs: Value: 50
    }
}
