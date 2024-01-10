package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class School {
    String name;
    int studentsCount;
    
    void displaySchoolInfo() {
        System.out.println("School Name: " + name + ", Students Count: " + studentsCount);
    }
}

public class Test10SchoolExample {
    public static void main(String[] args) {
        School school1 = new School();
        school1.name = "ABC School";
        school1.studentsCount = 500;
        
        School school2 = new School();
        school2.name = "XYZ School";
        school2.studentsCount = 750;
        
        school1.displaySchoolInfo(); // Outputs: School Name: ABC School, Students Count: 500
        school2.displaySchoolInfo(); // Outputs: School Name: XYZ School, Students Count: 750
    }
}
