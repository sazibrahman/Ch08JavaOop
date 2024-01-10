package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Dog {
    String breed;
    int age;
    
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class Test04DogExample {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.breed = "Labrador";
        dog1.age = 3;
        
        Dog dog2 = new Dog();
        dog2.breed = "German Shepherd";
        dog2.age = 5;
        
        dog1.bark(); // Outputs: Woof! Woof!
        dog2.bark(); // Outputs: Woof! Woof!
    }
}
