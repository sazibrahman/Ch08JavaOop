package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass20 {
	public int value = 90;
}

class Test18PublicFieldInherited extends Superclass20 {
	public static void main(String[] args) {
		Test18PublicFieldInherited obj = new Test18PublicFieldInherited();
		System.out.println("Inherited public field value: " + obj.value); // Outputs: Inherited public field value: 90
	}
}
