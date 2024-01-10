package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Smartphone {
    String brand;
    String model;
    int storage;
    
    void makeCall(String contact) {
        System.out.println("Calling " + contact + "...");
    }
    
    void displayDetails() {
        System.out.println("Brand: " + brand + ", Model: " + model + ", Storage: " + storage + "GB");
    }
}

public class Test16SmartphoneExample {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone();
        phone1.brand = "Samsung";
        phone1.model = "Galaxy S21";
        phone1.storage = 128;
        
        Smartphone phone2 = new Smartphone();
        phone2.brand = "Apple";
        phone2.model = "iPhone 13";
        phone2.storage = 256;
        
        phone1.makeCall("Mom"); // Outputs: Calling Mom...
        phone2.makeCall("Friend"); // Outputs: Calling Friend...
        
        phone1.displayDetails(); // Outputs: Brand: Samsung, Model: Galaxy S21, Storage: 128GB
        phone2.displayDetails(); // Outputs: Brand: Apple, Model: iPhone 13, Storage: 256GB
    }
}
