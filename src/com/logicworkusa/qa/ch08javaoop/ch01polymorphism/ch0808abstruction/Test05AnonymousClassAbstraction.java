package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class AClass05 {
    abstract void display();
}

class Test05AnonymousClassAbstraction {
    public static void main(String[] args) {
    	AClass05 obj = new AClass05() {
            void display() {
                System.out.println("Anonymous class implementation");
            }
        };

        obj.display(); // Outputs: Anonymous class implementation
    }
}
