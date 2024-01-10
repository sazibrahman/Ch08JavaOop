package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass08 {
	protected int value = 40;
}

class Test08ProtectedFieldAccess extends Superclass08 {
	public static void main(String[] args) {
		Test08ProtectedFieldAccess obj = new Test08ProtectedFieldAccess();
		System.out.println("Protected field value: " + obj.value); // Outputs: Protected field value: 40
	}
}
