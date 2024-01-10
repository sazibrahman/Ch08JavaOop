package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0807overriding;

class SuperClass06 {
	SuperClass06 get() {
        System.out.println("Parent class method");
        return this;
    }
}

class SubClass06 extends SuperClass06 {
    // Covariant return type allows a more specific return type in the subclass
	SuperClass06 get() {
        System.out.println("Subclass method (Overridden)");
        return this;
    }
}

class Test06CovariantReturnOverride extends SuperClass06 {
    public static void main(String[] args) {
        new SubClass06().get(); // Outputs: Subclass method (Overridden)
    }
}
