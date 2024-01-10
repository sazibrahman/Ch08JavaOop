package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

final class SuperClass08 {
    void display() {
        System.out.println("Final class method");
    }
}

// Won't compile - can't inherit from a final class
class SubClass08 extends SuperClass08 {

}

class Test08FinalClassInheritance {
     public static void main(String[] args) {
    	 SubClass08 obj = new SubClass08();
         // obj.display();
     }
}
