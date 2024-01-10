package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Bicycle {
    String brand;
    int gear;
    double speed;
    
    void speedUp(double increment) {
        speed += increment;
        System.out.println("Speed increased to " + speed + " mph");
    }
    
    void applyBrake(double decrement) {
        speed -= decrement;
        System.out.println("Speed decreased to " + speed + " mph");
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Gear: " + gear + ", Speed: " + speed + " mph");
    }
}

public class Test20BicycleExample {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        bike1.brand = "Trek";
        bike1.gear = 3;
        bike1.speed = 10.0;
        
        Bicycle bike2 = new Bicycle();
        bike2.brand = "Giant";
        bike2.gear = 7;
        bike2.speed = 15.0;
        
        bike1.speedUp(5.0); // Outputs: Speed increased to 15.0 mph
        bike2.applyBrake(3.0); // Outputs: Speed decreased to 12.0 mph
        
        bike1.displayInfo(); // Outputs: Details of the Trek bicycle
        bike2.displayInfo(); // Outputs: Details of the Giant bicycle
    }
}
