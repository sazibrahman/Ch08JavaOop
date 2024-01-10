package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Test09PrivateConstructorAccess {
	private Test09PrivateConstructorAccess() {
		System.out.println("Private constructor - Cannot be instantiated outside the class.");
	}

	public static void main(String[] args) {
		// Won't compile - private constructor is not accessible outside the class
		// Test09PrivateConstructorAccess obj = new Test09PrivateConstructorAccess();
	}
}
