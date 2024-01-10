package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class University {
    String name;
    String location;
    int numOfStudents;
    
    void enrollStudent(String studentName) {
        System.out.println("Enrolling " + studentName + "...");
    }
    
    void displayInfo() {
        System.out.println("University: " + name);
        System.out.println("Location: " + location);
        System.out.println("Number of Students: " + numOfStudents);
    }
}

public class Test19UniversityExample {
    public static void main(String[] args) {
        University uni1 = new University();
        uni1.name = "ABC University";
        uni1.location = "City Center";
        uni1.numOfStudents = 15000;
        
        University uni2 = new University();
        uni2.name = "XYZ College";
        uni2.location = "Suburb Area";
        uni2.numOfStudents = 8000;
        
        uni1.enrollStudent("Alice"); // Outputs: Enrolling Alice...
        uni2.enrollStudent("Bob"); // Outputs: Enrolling Bob...
        
        uni1.displayInfo(); // Outputs: Details of ABC University
        uni2.displayInfo(); // Outputs: Details of XYZ College
    }
}
