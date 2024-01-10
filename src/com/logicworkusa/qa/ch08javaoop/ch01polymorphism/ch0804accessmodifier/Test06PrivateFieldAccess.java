package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass0804 {
    private int value = 20;

    public int getValue() {
        return value;
    }
}

class Test06PrivateFieldAccess {
    public static void main(String[] args) {
    	AnotherClass0804 obj = new AnotherClass0804();
        // Won't compile - private field is not accessible outside the class
        // System.out.println("Private field value: " + obj.value);
        System.out.println("Private field value through method: " + obj.getValue()); // Outputs: Private field value through method: 20
    }
}
