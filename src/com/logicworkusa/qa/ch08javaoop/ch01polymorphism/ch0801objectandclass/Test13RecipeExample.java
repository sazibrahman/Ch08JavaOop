package com.logicworkusa.qa.ch08javaoop.ch01polymorphism.ch0801objectandclass;
class Recipe {
    String name;
    int servings;
    String[] ingredients;
    
    void displayRecipe() {
        System.out.println("Recipe: " + name);
        System.out.println("Servings: " + servings);
        System.out.println("Ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("- " + ingredient);
        }
    }
}

public class Test13RecipeExample {
    public static void main(String[] args) {
        Recipe recipe1 = new Recipe();
        recipe1.name = "Chocolate Cake";
        recipe1.servings = 8;
        recipe1.ingredients = new String[]{"Flour", "Sugar", "Cocoa", "Eggs", "Milk", "Oil"};
        
        Recipe recipe2 = new Recipe();
        recipe2.name = "Pasta Carbonara";
        recipe2.servings = 4;
        recipe2.ingredients = new String[]{"Pasta", "Eggs", "Bacon", "Parmesan Cheese", "Black Pepper"};
        
        recipe1.displayRecipe(); // Outputs: Details of the Chocolate Cake recipe
        recipe2.displayRecipe(); // Outputs: Details of the Pasta Carbonara recipe
    }
}
