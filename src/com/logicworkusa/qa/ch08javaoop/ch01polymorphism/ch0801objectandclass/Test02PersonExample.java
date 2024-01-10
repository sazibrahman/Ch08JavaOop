package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Person {
    String name;
    int age;
    
    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

public class Test02PersonExample {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Alice";
        person1.age = 30;
        
        Person person2 = new Person();
        person2.name = "Bob";
        person2.age = 25;
        
        person1.greet(); // Outputs: Hello, my name is Alice and I am 30 years old.
        person2.greet(); // Outputs: Hello, my name is Bob and I am 25 years old.
    }
}
