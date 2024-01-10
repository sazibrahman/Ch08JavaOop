package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass07 {
    abstract void display();
}

abstract class Subclass07 extends SuperClass07 {
    abstract void show();
}

class ConcreteSubclass07 extends Subclass07 {
    void display() {
        System.out.println("Abstract method implementation in subclass");
    }

    void show() {
        System.out.println("Another abstract method implementation in subclass");
    }
}

class Test07AbstractInheritance {
    public static void main(String[] args) {
    	ConcreteSubclass07 obj = new ConcreteSubclass07();
        obj.display(); // Outputs: Abstract method implementation in subclass
        obj.show();    // Outputs: Another abstract method implementation in subclass
    }
}
