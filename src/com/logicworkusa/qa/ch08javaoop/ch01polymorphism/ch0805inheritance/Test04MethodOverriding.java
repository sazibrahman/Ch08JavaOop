package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass04 {
    void display() {
        System.out.println("SuperClass04: displaying");
    }
}

class SubClass04 extends SuperClass04 {
    void display() {
        System.out.println("SubClass04: showing");
    }
}

public class Test04MethodOverriding {
	public static void main(String[] args) {
		SuperClass04 superClass04 = new SuperClass04();
		superClass04.display();
		
		SubClass04 subClass04 = new SubClass04();
		subClass04.display();
	}
}
