package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0808abstruction;

abstract class Test16AbstractWithFinalMethod {
    final void display() {
        System.out.println("Final method in abstract class");
    }
}

// Won't compile - final method cannot be overridden
// class Subclass16 extends Test16AbstractWithFinalMethod {
//     void display() {
//         System.out.println("Subclass method");
//     }
// }
