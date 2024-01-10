package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test10GreetingMethod {
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        Test10GreetingMethod greeting = new Test10GreetingMethod();
        greeting.greet("Alice"); // Outputs: Hello, Alice!
    }
}
