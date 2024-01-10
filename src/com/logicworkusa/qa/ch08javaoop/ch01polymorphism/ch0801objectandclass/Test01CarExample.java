package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Car {
    String brand;
    String model;
    
    void start() {
        System.out.println("The " + brand + " " + model + " has started.");
    }
}

public class Test01CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Corolla";
        
        Car anotherCar = new Car();
        anotherCar.brand = "Tesla";
        anotherCar.model = "Model S";
        
        myCar.start(); // Outputs: The Toyota Corolla has started.
        anotherCar.start(); // Outputs: The Tesla Model S has started.
    }
}
