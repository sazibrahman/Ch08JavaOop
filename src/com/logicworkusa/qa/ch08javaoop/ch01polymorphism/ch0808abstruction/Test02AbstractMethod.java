package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Superclass02 {
    abstract void display(); // Abstract method

    public void hide() {
        System.out.println("From super class");
    }
}

class Subclass02 extends Superclass02 {
    void display() {
        System.out.println("Abstract method implementation in subclass");
    }
}

class Test02AbstractMethod {
    public static void main(String[] args) {
    	Subclass02 obj = new Subclass02();
    	obj.hide();
        obj.display(); // Outputs: Abstract method implementation in subclass
        
        // Won't compile - can't create an instance of an abstract class
        // Superclass02 obj2 = new Superclass02();
    }
}
