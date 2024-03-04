package bankATM;
import java.util.HashMap;
import java.util.Scanner;

import java.util.Scanner;
	public class Main {
	    public static void main(String[] args) {
	        ATM atm = new ATM();
	        Scanner scanner = new Scanner(System.in);

	        // User Authentication
	        boolean authenticated = false;
	        do {
	            System.out.println("Welcome to the ATM. Please enter your user ID:");
	            String userID = scanner.nextLine();
	            System.out.println("Please enter your PIN:");
	            String userPIN = scanner.nextLine();
	            authenticated = atm.authenticateUser(userID, userPIN);
	            if (!authenticated) {
	                System.out.println("Invalid user ID or PIN. Please try again.");
	            }
	        } while (!authenticated);

	        // Main menu
	        while (true) {
	            System.out.println("\nATM Menu:");
	            System.out.println("1. Check Balance");
	            System.out.println("2. Withdraw Money");
	            System.out.println("3. Deposit Money");
	            System.out.println("4. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();
	            switch (choice) {
	                case 1:
	                    System.out.println("Your account balance is: $" + atm.checkBalance());
	                    break;
	                case 2:
	                    System.out.print("Enter amount to withdraw: $");
	                    double withdrawAmount = scanner.nextDouble();
	                    boolean withdrawn = atm.withdraw(withdrawAmount);
	                    if (withdrawn) {
	                        System.out.println("Withdrawal successful.");
	                    } else {
	                        System.out.println("Insufficient funds or invalid amount.");
	                    }
	                    break;
	                case 3:
	                    System.out.print("Enter amount to deposit: $");
	                    double depositAmount = scanner.nextDouble();
	                    atm.deposit(depositAmount);
	                    System.out.println("Deposit successful.");
	                    break;
	                case 4:
	                    System.out.println("Thank you for using the ATM. Goodbye!");
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        }
	    }
	}

