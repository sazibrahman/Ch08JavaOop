package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass01 {
	void display() {
		System.out.println("SuperClass01: displaying");
	}
}

public class Test01SingleInheritance {
	public static void main(String[] args) {
		SuperClass01 obj = new SuperClass01();
		obj.display(); // Outputs: Parent class method
	}
}
