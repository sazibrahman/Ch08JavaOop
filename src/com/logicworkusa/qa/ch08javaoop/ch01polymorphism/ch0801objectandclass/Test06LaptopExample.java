package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Laptop {
    String brand;
    String model;
    double screenSize;
    
    void turnOn() {
        System.out.println("The " + brand + " " + model + " is starting up.");
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Screen Size: " + screenSize + " inches");
    }
}

public class Test06LaptopExample {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        laptop1.brand = "HP";
        laptop1.model = "Envy";
        laptop1.screenSize = 15.6;
        
        Laptop laptop2 = new Laptop();
        laptop2.brand = "Apple";
        laptop2.model = "MacBook Pro";
        laptop2.screenSize = 13.3;
        
        laptop1.turnOn(); // Outputs: The HP Envy is starting up.
        laptop2.turnOn(); // Outputs: The Apple MacBook Pro is starting up.
        
        laptop1.displayInfo(); // Outputs: Brand: HP, Model: Envy, Screen Size: 15.6 inches
        laptop2.displayInfo(); // Outputs: Brand: Apple, Model: MacBook Pro, Screen Size: 13.3 inches
    }
}
