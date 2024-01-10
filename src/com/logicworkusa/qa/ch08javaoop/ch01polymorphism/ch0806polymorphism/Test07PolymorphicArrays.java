package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0806polymorphism;

class SuperClass07 {
	void display() {
		System.out.println("Inside display method");
	}
}

class Subclass07 extends SuperClass07 {
	void display() {
		System.out.println("Inside display method of Subclass1");
	}
}

class AnotherSubclass07 extends SuperClass07 {
	void display() {
		System.out.println("Inside display method of Subclass2");
	}
}

class Test07PolymorphicArrays {
	public static void main(String[] args) {
		SuperClass07[] arr = new SuperClass07[3];
		arr[0] = new SuperClass07();
		arr[1] = new Subclass07();
		arr[2] = new AnotherSubclass07();

		for (SuperClass07 obj : arr) {
			obj.display();
		}
		// Outputs:
		// Inside display method
		// Inside display method of Subclass1
		// Inside display method of Subclass2
	}
}
