package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class AnotherClass14 {
    private static int value = 60;

    public static int getValue() {
        return value;
    }
}

class Test14PrivateStaticField {
    public static void main(String[] args) {
        // Won't compile - private static field is not accessible outside the class
        // System.out.println("Private static field value: " + Test14PrivateStaticField.value);
        System.out.println("Private static field value through method: " + AnotherClass14.getValue()); // Outputs: Private static field value through method: 60
    }
}
