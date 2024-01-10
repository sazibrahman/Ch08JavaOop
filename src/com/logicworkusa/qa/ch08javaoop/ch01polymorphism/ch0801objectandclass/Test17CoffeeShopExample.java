package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class CoffeeShop {
    String name;
    String location;
    int numOfEmployees;
    
    void serveCoffee(String type) {
        System.out.println("Preparing " + type + " coffee...");
    }
    
    void displayInfo() {
        System.out.println("Coffee Shop: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Employees: " + numOfEmployees);
    }
}

public class Test17CoffeeShopExample {
    public static void main(String[] args) {
        CoffeeShop shop1 = new CoffeeShop();
        shop1.name = "Java Junction";
        shop1.location = "Main Street";
        shop1.numOfEmployees = 8;
        
        CoffeeShop shop2 = new CoffeeShop();
        shop2.name = "Bean Buzz";
        shop2.location = "Center Square";
        shop2.numOfEmployees = 5;
        
        shop1.serveCoffee("Latte"); // Outputs: Preparing Latte coffee...
        shop2.serveCoffee("Espresso"); // Outputs: Preparing Espresso coffee...
        
        shop1.displayInfo(); // Outputs: Details of Java Junction coffee shop
        shop2.displayInfo(); // Outputs: Details of Bean Buzz coffee shop
    }
}
