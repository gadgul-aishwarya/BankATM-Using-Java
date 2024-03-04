package bankATM;
import java.util.HashMap;
import java.util.Scanner;
	// User class to represent each user of the ATM
	class User {
	    private String userID;
	    private String userPIN;
	    private double accountBalance;

	    // Constructor
	    public User(String userID, String userPIN, double accountBalance) {
	        this.userID = userID;
	        this.userPIN = userPIN;
	        this.accountBalance = accountBalance;
	    }

	    // Getter methods
	    public String getUserID() {
	        return userID;
	    }

	    public String getUserPIN() {
	        return userPIN;
	    }

	    public double getAccountBalance() {
	        return accountBalance;
	    }

	    // Setter method for updating account balance
	    public void setAccountBalance(double newBalance) {
	        this.accountBalance = newBalance;
	    }
	}

