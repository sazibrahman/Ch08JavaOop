package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass02 {
    protected void display() {
        System.out.println("Parent class method");
    }
}

class Test02AccessModifierOverride extends SuperClass02 {
    // Won't compile - attempting to reduce the access scope in the overridden method
    // private void display() {
    //     System.out.println("Subclass method (Overridden)");
    // }
}
