package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class MusicPlayer {
    String brand;
    String color;
    boolean isPortable;
    
    void playMusic() {
        System.out.println("Playing music...");
    }
    
    void displayInfo() {
        System.out.println("Brand: " + brand + ", Color: " + color + ", Portable: " + isPortable);
    }
}

public class Test14MusicPlayerExample {
    public static void main(String[] args) {
        MusicPlayer player1 = new MusicPlayer();
        player1.brand = "Sony";
        player1.color = "Black";
        player1.isPortable = true;
        
        MusicPlayer player2 = new MusicPlayer();
        player2.brand = "Bose";
        player2.color = "White";
        player2.isPortable = false;
        
        player1.playMusic(); // Outputs: Playing music...
        player1.displayInfo(); // Outputs: Brand: Sony, Color: Black, Portable: true
        
        player2.playMusic(); // Outputs: Playing music...
        player2.displayInfo(); // Outputs: Brand: Bose, Color: White, Portable: false
    }
}
