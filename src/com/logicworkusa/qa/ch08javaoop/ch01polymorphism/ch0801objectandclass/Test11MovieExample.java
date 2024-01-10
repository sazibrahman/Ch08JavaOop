package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Movie {
    String title;
    int year;
    String genre;
    
    void displayInfo() {
        System.out.println("Title: " + title + ", Year: " + year + ", Genre: " + genre);
    }
}

public class Test11MovieExample {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.title = "Inception";
        movie1.year = 2010;
        movie1.genre = "Sci-Fi";
        
        Movie movie2 = new Movie();
        movie2.title = "The Shawshank Redemption";
        movie2.year = 1994;
        movie2.genre = "Drama";
        
        movie1.displayInfo(); // Outputs: Title: Inception, Year: 2010, Genre: Sci-Fi
        movie2.displayInfo(); // Outputs: Title: The Shawshank Redemption, Year: 1994, Genre: Drama
    }
}
