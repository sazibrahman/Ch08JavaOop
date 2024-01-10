package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass12 {
    protected void display() {
        System.out.println("Protected method - Accessible within the package and subclasses.");
    }
}

class Test12ProtectedMethod extends Superclass12 {
    public static void main(String[] args) {
    	Test12ProtectedMethod obj = new Test12ProtectedMethod();
        obj.display(); // Outputs: Protected method - Accessible within the package and subclasses.
    }
}
