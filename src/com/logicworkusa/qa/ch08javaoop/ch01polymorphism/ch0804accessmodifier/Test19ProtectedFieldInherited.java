package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass19 {
    protected int value = 100;
}

class Test19ProtectedFieldInherited extends Superclass19 {
    public static void main(String[] args) {
    	Test19ProtectedFieldInherited obj = new Test19ProtectedFieldInherited();
        System.out.println("Inherited protected field value: " + obj.value); // Outputs: Inherited protected field value: 100
    }
}
