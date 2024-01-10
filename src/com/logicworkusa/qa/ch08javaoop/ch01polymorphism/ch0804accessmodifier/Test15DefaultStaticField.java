package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass08 {
	static int value = 70;
}

class Test15DefaultStaticField {
	public static void main(String[] args) {
		System.out.println("Default static field value: " + AnotherClass08.value); // Outputs: Default static field
																					// value: 70
	}
}
