package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass04 {
	public int value = 10;
}

class Test05PublicFieldAccess {
	public static void main(String[] args) {
		AnotherClass04 obj = new AnotherClass04();
		System.out.println("Public field value: " + obj.value); // Outputs: Public field value: 10
	}
}
