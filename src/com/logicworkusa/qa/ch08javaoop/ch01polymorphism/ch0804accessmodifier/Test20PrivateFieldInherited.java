package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Superclass10 {
    private int value = 110;
}

class Test20PrivateFieldInherited extends Superclass10 {
    public static void main(String[] args) {
    	Test20PrivateFieldInherited obj = new Test20PrivateFieldInherited();
        // Won't compile - private field is not accessible in the subclass
        // System.out.println("Inherited private field value: " + obj.value);
    }
}
