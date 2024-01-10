package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Book {
    String title;
    String author;
    
    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class Test03BookExample {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "Java Programming";
        book1.author = "John Smith";
        
        Book book2 = new Book();
        book2.title = "Harry Potter";
        book2.author = "J.K. Rowling";
        
        book1.displayInfo(); // Outputs: Title: Java Programming, Author: John Smith
        book2.displayInfo(); // Outputs: Title: Harry Potter, Author: J.K. Rowling
    }
}
