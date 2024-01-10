package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0802method;
public class Test07StringConcatenationMethod {
    public String concatenateStrings(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        Test07StringConcatenationMethod str = new Test07StringConcatenationMethod();
        String result = str.concatenateStrings("Hello, ", "World!");
        System.out.println("Concatenated String: " + result); // Outputs: Concatenated String: Hello, World!
    }
}
