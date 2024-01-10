package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass02 {
    void display() {
        System.out.println("SuperClass02: displaying");
    }
}

class SubClass02 extends SuperClass02 {
    void show() {
        System.out.println("Subclass02: showing");
    }
}

class AnotherSubClass02 extends SubClass02 {
	void greet() {
        System.out.println("AnotherSubClass02: greeting");
    }
}

public class Test02MultiLevelInheritance {
    public static void main(String[] args) {
    	SubClass02 subClass02 = new SubClass02();
    	subClass02.display(); // Outputs: Parent class method
    	subClass02.show();    // Outputs: Subclass method
    	
    	AnotherSubClass02 anotherSubClass02 = new AnotherSubClass02();
    	anotherSubClass02.display(); // Outputs: Parent class method
    }
}
