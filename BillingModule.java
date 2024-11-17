package OnlineShoppingApp_Ass1;

import java.util.Scanner;
 
public class BillingModule {
    public void generateBill(Scanner sc, double t_amt) {
        System.out.println("\n|| BILLING ||");
 
        System.out.print("\nTotal amount payable: ₹" + t_amt);
        System.out.print("\n");
        double amount = t_amt;
 
        System.out.println("\nPayment Methods:\n");
        System.out.println("1) Cash on Delivery");
        System.out.println("2) Paytm");
        System.out.println("3) PhonePe");
        System.out.println("4) GPay");
 
        System.out.print("\nChoose a payment method: ");
        int paymentMethod = sc.nextInt();
        sc.nextLine();
 
        switch (paymentMethod) {
            case 1:
                System.out.println("You chose Cash on Delivery.");
                break;
            case 2:
                System.out.println("You chose Paytm.");
                break;
            case 3:
            	System.out.println("You chose PhonePe.");
            	break;
            case 4:
                System.out.println("You chose GPay.");
                break;
            default:
                System.out.println("Invalid payment method.");
                return;
        }
 
        System.out.println("\nYour payment of ₹" + amount + " has been processed successfully.");
    }
}