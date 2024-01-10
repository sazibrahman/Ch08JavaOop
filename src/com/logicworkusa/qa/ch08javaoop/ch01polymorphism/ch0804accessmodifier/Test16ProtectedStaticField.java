package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass21 {
	protected static int value = 80;
}

class Test16ProtectedStaticField extends Superclass21 {
	public static void main(String[] args) {
		System.out.println("Protected static field value: " + Test16ProtectedStaticField.value); // Outputs: Protected static field
																					// value: 80
	}
}
