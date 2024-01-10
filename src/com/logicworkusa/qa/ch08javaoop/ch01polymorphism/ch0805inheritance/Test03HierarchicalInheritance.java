package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass03 {
    void display() {
        System.out.println("SuperClass03: displaying");
    }
}

class SubClass03 extends SuperClass03 {
    void show() {
        System.out.println("SubClass03: showing");
    }
}

class AnotherSubClass03 extends SuperClass03 {
	void greet() {
        System.out.println("AnotherSubClass03: greeting");
    }
}

public class Test03HierarchicalInheritance {
    public static void main(String[] args) {
    	SubClass03 subClass03 = new SubClass03();
    	subClass03.display(); // Outputs: Parent class method
    	subClass03.show();    // Outputs: Subclass method
    	
    	AnotherSubClass03 anotherSubClass03 = new AnotherSubClass03();
    	anotherSubClass03.display(); // Outputs: Parent class method
    }
}
