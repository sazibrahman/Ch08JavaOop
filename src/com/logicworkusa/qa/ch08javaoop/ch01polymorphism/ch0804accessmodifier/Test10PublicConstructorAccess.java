package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Test10PublicConstructorAccess {
    public Test10PublicConstructorAccess() {
        System.out.println("Public constructor - Can be instantiated from anywhere.");
    }

    public static void main(String[] args) {
        Test10PublicConstructorAccess obj = new Test10PublicConstructorAccess();
        // Outputs: Public constructor - Can be instantiated from anywhere.
    }
}
