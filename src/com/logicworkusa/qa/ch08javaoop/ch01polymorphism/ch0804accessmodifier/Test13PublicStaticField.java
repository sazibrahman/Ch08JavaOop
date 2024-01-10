package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass13 {
	public static int value = 50;
}

class Test13PublicStaticField {
	public static void main(String[] args) {
		System.out.println("Public static field value: " + AnotherClass13.value); // Outputs: Public static field value:
																					// 50
	}
}
