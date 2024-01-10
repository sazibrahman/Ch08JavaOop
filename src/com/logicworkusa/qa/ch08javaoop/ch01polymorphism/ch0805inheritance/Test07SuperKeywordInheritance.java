package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass07 {
    String message = "Parent class message";

    void display() {
        System.out.println("Parent class method");
    }
}

class Subclass07 extends SuperClass07 {
    String message = "Subclass message";

    void display() {
        System.out.println("Subclass method");
    }

    void printMessages() {
        System.out.println(super.message); // Accessing parent class variable
        super.display(); // Calling parent class method
    }
}

class Test07SuperKeywordInheritance {
    public static void main(String[] args) {
    	Subclass07 obj = new Subclass07();
        obj.printMessages();
        // Outputs:
        // Parent class message
        // Parent class method
    }
}
