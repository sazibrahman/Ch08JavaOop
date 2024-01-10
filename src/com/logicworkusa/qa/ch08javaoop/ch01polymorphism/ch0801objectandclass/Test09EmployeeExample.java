package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Employee {
    String name;
    int employeeId;
    double salary;
    
    void displayInfo() {
        System.out.println("Employee Name: " + name + ", ID: " + employeeId + ", Salary: $" + salary);
    }
}

public class Test09EmployeeExample {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Alice";
        emp1.employeeId = 101;
        emp1.salary = 50000;
        
        Employee emp2 = new Employee();
        emp2.name = "Bob";
        emp2.employeeId = 102;
        emp2.salary = 60000;
        
        emp1.displayInfo(); // Outputs: Employee Name: Alice, ID: 101, Salary: $50000
        emp2.displayInfo(); // Outputs: Employee Name: Bob, ID: 102, Salary: $60000
    }
}
