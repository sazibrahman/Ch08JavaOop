package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class AClass17 {
    abstract void display();
}

class Test17AbstractInAnonymousClass {
    public static void main(String[] args) {
    	AClass17 obj = new AClass17() {
            void display() {
                System.out.println("Anonymous class implementation");
            }
        };

        obj.display(); // Outputs: Anonymous class implementation
    }
}
