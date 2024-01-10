package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass06 {
	SuperClass06() {
        System.out.println("Parent class constructor");
    }
	
	SuperClass06(String name) {
        System.out.println("Parent class constructor: seeting name: " + name);
    }
}

class SubClass06 extends SuperClass06 {
	SubClass06() {
        System.out.println("Subclass constructor");
    }
}

class Test06ConstructorInheritance {
    public static void main(String[] args) {
    	SubClass06 obj1 = new SubClass06();
    	
        // Outputs:
        // Parent class constructor
        // Subclass constructor
    }
}
