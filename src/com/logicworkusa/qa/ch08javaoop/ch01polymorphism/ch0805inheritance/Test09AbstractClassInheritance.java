package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

abstract class SuperClass09 {
    abstract void display();
}

class SubClass09 extends SuperClass09 {
    void display() {
        System.out.println("Abstract method implemented");
    }
}

class Test09AbstractClassInheritance {
    public static void main(String[] args) {
    	SubClass09 obj = new SubClass09();
        obj.display(); // Outputs: Abstract method implemented
    }
}
