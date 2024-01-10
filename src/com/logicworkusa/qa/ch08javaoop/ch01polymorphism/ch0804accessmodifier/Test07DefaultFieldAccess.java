package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass07 {
	int value = 30;
}

class Test07DefaultFieldAccess {
	public static void main(String[] args) {
		AnotherClass07 obj = new AnotherClass07();
		System.out.println("Default field value: " + obj.value); // Outputs: Default field value: 30
	}
}
