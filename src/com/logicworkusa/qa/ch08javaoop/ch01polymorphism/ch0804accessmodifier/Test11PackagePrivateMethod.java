package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0804accessmodifier;

class Test11PackagePrivateMethod {
    void display() {
        System.out.println("Package-private method - Accessible within the package.");
    }

    public static void main(String[] args) {
        Test11PackagePrivateMethod obj = new Test11PackagePrivateMethod();
        obj.display(); // Outputs: Package-private method - Accessible within the package.
    }
}
