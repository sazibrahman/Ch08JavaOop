package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

interface AnInterface03 {
    void display(); // Abstract method by default in interfaces

    default void defaultMethod() {
        System.out.println("Default method in interface");
    }

    static void staticMethod() {
        System.out.println("Static method in interface");
    }
}

class AClass03 implements AnInterface03 {
    public void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test03Interface {
    public static void main(String[] args) {
    	AClass03 obj = new AClass03();
        obj.display();          // Outputs: Abstract method implementation in subclass
        obj.defaultMethod();    // Outputs: Default method in interface
        AnInterface03.staticMethod(); // Outputs: Static method in interface
        
        // Won't compile - can't create an instance of an interface
        // AnInterface03 obj2 = new AnInterface03();
    }
}
