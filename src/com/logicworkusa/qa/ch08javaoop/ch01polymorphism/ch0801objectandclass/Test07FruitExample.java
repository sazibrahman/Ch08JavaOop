package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Fruit {
    String name;
    String color;
    
    void describe() {
        System.out.println("A " + color + " " + name);
    }
}

public class Test07FruitExample {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.name = "Apple";
        apple.color = "Red";
        
        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.color = "Yellow";
        
        apple.describe(); // Outputs: A Red Apple
        banana.describe(); // Outputs: A Yellow Banana
    }
}
