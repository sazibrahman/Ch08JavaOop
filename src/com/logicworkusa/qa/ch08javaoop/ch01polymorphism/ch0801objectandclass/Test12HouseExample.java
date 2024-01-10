package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class House {
    String address;
    int bedrooms;
    double price;
    
    void displayDetails() {
        System.out.println("Address: " + address + ", Bedrooms: " + bedrooms + ", Price: $" + price);
    }
}

public class Test12HouseExample {
    public static void main(String[] args) {
        House house1 = new House();
        house1.address = "123 Main St";
        house1.bedrooms = 3;
        house1.price = 250000;
        
        House house2 = new House();
        house2.address = "456 Elm St";
        house2.bedrooms = 4;
        house2.price = 350000;
        
        house1.displayDetails(); // Outputs: Address: 123 Main St, Bedrooms: 3, Price: $250000
        house2.displayDetails(); // Outputs: Address: 456 Elm St, Bedrooms: 4, Price: $350000
    }
}
