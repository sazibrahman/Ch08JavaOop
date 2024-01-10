package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Test17PublicConstructorOverload {
	public Test17PublicConstructorOverload() {
		System.out.println("Public constructor - Can be instantiated from anywhere.");
	}

	public Test17PublicConstructorOverload(int val) {
		System.out.println("Parameterized public constructor - Value: " + val);
	}

	public static void main(String[] args) {
		Test17PublicConstructorOverload obj1 = new Test17PublicConstructorOverload(); // Outputs: Public constructor -
																						// Can be instantiated from
																						// anywhere.
		Test17PublicConstructorOverload obj2 = new Test17PublicConstructorOverload(42); // Outputs: Parameterized public
																						// constructor - Value: 42
	}
}
