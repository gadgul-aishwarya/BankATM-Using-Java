package bankATM;
import java.util.HashMap;
import java.util.Scanner;
	// ATM class encapsulating ATM functionalities
	class ATM {
	    private HashMap<String, User> users;
	    private User currentUser;

	    // Constructor
	    public ATM() {
	        users = new HashMap<>();
	        // Example users (In real implementation, users would be retrieved from a database)
	        users.put("123456", new User("123456", "7890", 1000.0));
	        users.put("789012", new User("789012", "1234", 500.0));
	    }

	    // Method to authenticate user
	    public boolean authenticateUser(String userID, String userPIN) {
	        if (users.containsKey(userID)) {
	            User user = users.get(userID);
	            if (user.getUserPIN().equals(userPIN)) {
	                currentUser = user;
	                return true;
	            }
	        }
	        return false;
	    }

	    // Method to check balance
	    public double checkBalance() {
	        return currentUser.getAccountBalance();
	    }

	    // Method to withdraw money
	    public boolean withdraw(double amount) {
	        if (amount > 0 && amount <= currentUser.getAccountBalance()) {
	            double newBalance = currentUser.getAccountBalance() - amount;
	            currentUser.setAccountBalance(newBalance);
	            return true;
	        }
	        return false;
	    }

	    // Method to deposit money
	    public void deposit(double amount) {
	        if (amount > 0) {
	            double newBalance = currentUser.getAccountBalance() + amount;
	            currentUser.setAccountBalance(newBalance);
	        }
	    }
	}

	


