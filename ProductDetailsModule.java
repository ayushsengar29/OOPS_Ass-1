package OnlineShoppingApp_Ass1;

import java.util.Scanner;

public class ProductDetailsModule {
    public double showProductsAndCalculateTotal(Scanner sc) {
        System.out.println("|| PRODUCT DETAILS ||");
 
        // Define categories, items, and their prices
        String[] categories = {"Grocery", "Stationery", "Bakery", "Vegetables", "Fruits"};
        String[][] products = {
            {"Rice", "Wheat"},
            {"Notebook", "Pen"},
            {"Bread", "Pastries", "Cakes"},
            {"Potatoes", "Tomatoes"},
            {"Apples", "Bananas"},
        };
        double[][] prices = {
            {45, 35}, // Grocery
            {50, 10}, // Stationary
            {20, 70, 250}, // Bakery
            {150, 50}, // Vegetables
            {200, 150} // Fruits
        };
 
        double total = 0;
        boolean continueShopping = true;
 
        // Main shopping loop
        while (continueShopping) {
            // Display categories
            System.out.println("\nAvailable Categories:");
            for (int i = 0; i < categories.length; i++) {
                System.out.println((i + 1) + ". " + categories[i]);
            }
            System.out.println("0. Finish shopping");
 
            // Prompt user to choose a category
            System.out.print("\nEnter the category number: ");
            int category = sc.nextInt();
            sc.nextLine(); // Consume the newline
 
            if (category == 0) {
                continueShopping = false;
                break;
            }
 
            // Validate category selection
            if (category < 1 || category > categories.length) {
                System.out.println("\nInvalid category. Please try again.");
                continue;
            }
 
            // Display products in the chosen category
            System.out.println("\nItems in " + categories[category - 1] + ":");
            for (int i = 0; i < products[category - 1].length; i++) {
                System.out.println((i + 1) + ". " + products[category - 1][i] + " - ₹" + prices[category - 1][i] + "/unit");
            }
 
            // Select a product
            System.out.print("\nEnter the item number to add to your cart: ");
            int itemNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline
 
            // Validate item selection
            if (itemNumber < 1 || itemNumber > products[category - 1].length) {
                System.out.println("\nInvalid item selection. Please try again.");
                continue;
            }
 
            // Quantity
            System.out.print("\nEnter the quantity for " + products[category - 1][itemNumber - 1] + ": ");
            int quantity = sc.nextInt();
            sc.nextLine(); // Consume the newline
 
            // Cost for the selected item
            double cost = prices[category - 1][itemNumber - 1] * quantity;
            total += cost;
 
            // Display the sub-total
            System.out.println("");
            System.out.println(quantity + " unit(s) of " + products[category - 1][itemNumber - 1] + " added to cart for ₹" + cost);
            System.out.println("Subtotal so far: ₹" + total);
        }
 
        // Display the grand total
        System.out.println("\nYour total amount for the selected items: ₹" + total);
        return total;
    }
}