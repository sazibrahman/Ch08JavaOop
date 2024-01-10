package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0805inheritance;

interface GreetInterface10 {
    void greet();
}

interface ByeInterface10 {
    void bye();
}

class Human10 implements GreetInterface10, ByeInterface10 {
    public void greet() {
        System.out.println("Greetings....");
    }

    public void bye() {
        System.out.println("Bye bye");
    }
}

class Test10InterfaceInheritance {
    public static void main(String[] args) {
    	Human10 obj = new Human10();
        obj.greet(); // Outputs: Greetings....
        obj.bye();    // Outputs: Bye bye
        
        GreetInterface10 intr1 = obj;
        intr1.greet();
        
        ByeInterface10 intr2 = obj;
        intr2.bye();
        
        
    }
}
