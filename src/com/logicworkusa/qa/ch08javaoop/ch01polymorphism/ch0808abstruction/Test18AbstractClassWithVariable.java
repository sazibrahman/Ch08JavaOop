package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass18 {
    int value = 100; // Abstract class with a variable

    abstract void display();
}

class SubClass18 extends SuperClass18 {
    void display() {
        System.out.println("Value: " + value);
    }
}

class Test18AbstractClassWithVariable {
    public static void main(String[] args) {
        SubClass18 obj = new SubClass18();
        obj.display(); // Outputs: Value: 100
    }
}
