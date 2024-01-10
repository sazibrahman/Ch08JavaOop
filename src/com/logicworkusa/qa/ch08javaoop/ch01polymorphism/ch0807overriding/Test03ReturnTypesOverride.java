package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass03 {
    Number display() {
        System.out.println("Parent class method");
        return 0;
    }
}

class Test03ReturnTypesOverride extends SuperClass03 {
    // Won't compile - incompatible return type
    // Integer display() {
    //     System.out.println("Subclass method (Overridden)");
    //     return 0;
    // }
}
