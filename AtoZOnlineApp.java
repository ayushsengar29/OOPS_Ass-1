package OnlineShoppingApp_Ass1;

import java.util.Scanner;

public class AtoZOnlineApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("WELCOME TO 'AtoZ' ONLINE APP! ");
 
        // Registration Module
        RegistrationModule registration = new RegistrationModule();
        if (registration.registerUser(sc)) {
            // Product Details Module
            ProductDetailsModule productDetails = new ProductDetailsModule();
           double t_amt = productDetails.showProductsAndCalculateTotal(sc);
 
            // Billing Module
            BillingModule billing = new BillingModule();
            billing.generateBill(sc, t_amt);
        }
 
        System.out.println("Thank you, for using AtoZ Online Application!");
        sc.close();
    }
}