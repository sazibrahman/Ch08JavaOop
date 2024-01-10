package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;
abstract class Test11NestedAbstractClass {
    abstract void display();

    static class Nested {
        void show() {
            System.out.println("Nested class method");
        }
    }

    public static void main(String[] args) {
        Nested nestedObj = new Nested();
        nestedObj.show(); // Outputs: Nested class method
    }
}
