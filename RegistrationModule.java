package OnlineShoppingApp_Ass1;

import java.util.Scanner;

public class RegistrationModule {
    public boolean registerUser(Scanner sc) {
        System.out.println("\n|| REGISTER ||\n");
 
        // Validating the Name
        System.out.print("Enter your name (max 20 characters): ");
        String name = sc.nextLine();
        if (name.length() > 20) {
            System.out.println("Invalid name. Registration failed.");
            return false;
        }
 
        // Validating the Mobile Number
        System.out.print("Enter your mobile number (10 digits): ");
        String mobile = sc.nextLine();
        if (!mobile.matches("\\d{10}")) {
            System.out.println("Invalid mobile number. Registration failed.");
            return false;
        }
 
        // Validation (Address & Pin- 6 digits)
        System.out.print("Enter your address (Max. 100 Chars): ");
        String address = sc.nextLine();
        if (address.isEmpty()) {
        	System.out.println("Please enter address. Registration Failed.");
        	return false;
        }
        if (address.length()>100) {
        	System.out.println("Address should be less than 100 chars. Registration Failed.");
        	return false;
        }
 
        // Validating the Email and making Email ID optional to fill as directed
        System.out.print("Enter your email (optional): ");
        String email = sc.nextLine();
        
        if (!email.isEmpty()) {
            // Validate email only if provided
            if (!email.contains("@") || !email.contains(".")) {
                System.out.println("Invalid email ID. Registration failed.");
                return false;
            }
        }
 
        System.out.println("\nYou have been successfully registered. Proceed and choose required products.\n");
        return true;
    }
}