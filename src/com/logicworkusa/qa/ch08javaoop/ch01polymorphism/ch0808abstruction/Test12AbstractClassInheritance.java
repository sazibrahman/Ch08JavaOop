package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class SuperClass12 {
    abstract void display();

    void show() {
        System.out.println("Abstract class method");
    }
}

class Subclass12 extends SuperClass12 {
    void display() {
        System.out.println("Subclass method");
    }
}

class Test12AbstractClassInheritance {
    public static void main(String[] args) {
        Subclass12 obj = new Subclass12();
        obj.display(); // Outputs: Subclass method
        obj.show();    // Outputs: Abstract class method
    }
}
