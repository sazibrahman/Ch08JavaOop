package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

class SuperClass05 {
    public void publicMethod() {
        System.out.println("Public method in parent class");
    }

    protected void protectedMethod() {
        System.out.println("Protected method in parent class");
    }

    void defaultMethod() {
        System.out.println("Default method in parent class");
    }

    private void privateMethod() {
        System.out.println("Private method in parent class");
    }
}

class SubClass05 extends SuperClass05 {
    
}

class Test05AccessModifiersInheritance {
    public static void main(String[] args) {
    	SubClass05 obj = new SubClass05();
        obj.publicMethod();    // Outputs: Public method in parent class
        obj.protectedMethod(); // Outputs: Protected method in parent class
        obj.defaultMethod();   // Outputs: Default method in parent class
        // privateMethod() is not accessible in the subclass
    }
}
