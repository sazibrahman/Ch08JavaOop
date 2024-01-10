package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass01 {
    abstract void display(); // Abstract method

    void concreteMethod() {
        System.out.println("Concrete method in abstract class");
    }
}

class SubClass01 extends SuperClass01 {
    void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test01AbstractClass {
    public static void main(String[] args) {
    	SubClass01 obj = new SubClass01();
        obj.display();          // Outputs: Abstract method implementation in subclass
        obj.concreteMethod();   // Outputs: Concrete method in abstract class
    }
}
