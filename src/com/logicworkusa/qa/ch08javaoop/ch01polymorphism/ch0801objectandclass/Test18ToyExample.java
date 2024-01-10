package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Toy {
    String name;
    double price;
    boolean isBatteryOperated;
    
    void play() {
        System.out.println("Playing with the " + name);
    }
    
    void displayDetails() {
        System.out.println("Toy: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Battery Operated: " + isBatteryOperated);
    }
}

public class Test18ToyExample {
    public static void main(String[] args) {
        Toy toy1 = new Toy();
        toy1.name = "Robot";
        toy1.price = 29.99;
        toy1.isBatteryOperated = true;
        
        Toy toy2 = new Toy();
        toy2.name = "Teddy Bear";
        toy2.price = 14.99;
        toy2.isBatteryOperated = false;
        
        toy1.play(); // Outputs: Playing with the Robot
        toy2.play(); // Outputs: Playing with the Teddy Bear
        
        toy1.displayDetails(); // Outputs: Details of the Robot toy
        toy2.displayDetails(); // Outputs: Details of the Teddy Bear toy
    }
}
