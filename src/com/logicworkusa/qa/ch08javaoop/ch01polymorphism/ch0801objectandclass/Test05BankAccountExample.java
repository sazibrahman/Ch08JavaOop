package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class BankAccount {
    String accountNumber;
    double balance;
    
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }
    
    void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

public class Test05BankAccountExample {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount();
        acc1.accountNumber = "123456";
        acc1.balance = 1000;
        
        BankAccount acc2 = new BankAccount();
        acc2.accountNumber = "789012";
        acc2.balance = 500;
        
        acc1.deposit(200); // Outputs: Deposited: $200
        acc2.withdraw(100); // Outputs: Withdrawn: $100
        
        acc1.displayBalance(); // Outputs: Current Balance: $1200
        acc2.displayBalance(); // Outputs: Current Balance: $400
    }
}
