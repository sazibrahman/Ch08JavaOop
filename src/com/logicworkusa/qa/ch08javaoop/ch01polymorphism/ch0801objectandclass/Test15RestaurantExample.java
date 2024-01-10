package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Restaurant {
    String name;
    String cuisine;
    int rating;
    
    void displayInfo() {
        System.out.println("Restaurant: " + name);
        System.out.println("Cuisine: " + cuisine);
        System.out.println("Rating: " + rating + "/5");
    }
}

public class Test15RestaurantExample {
    public static void main(String[] args) {
        Restaurant restaurant1 = new Restaurant();
        restaurant1.name = "Taste of Italy";
        restaurant1.cuisine = "Italian";
        restaurant1.rating = 4;
        
        Restaurant restaurant2 = new Restaurant();
        restaurant2.name = "Spice Garden";
        restaurant2.cuisine = "Indian";
        restaurant2.rating = 5;
        
        restaurant1.displayInfo(); // Outputs: Details of Taste of Italy restaurant
        restaurant2.displayInfo(); // Outputs: Details of Spice Garden restaurant
    }
}
