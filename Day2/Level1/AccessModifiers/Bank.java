class BankAccount {
    public String accountNumber;
    protected String accountHolder;
    private double balance;
	

    // Constructor to initialize the bank account details
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
		
		totalAccounts++;
    }

    // Method to access the balance
    public double getBalance() {
        return this.balance;
    }

    // Method to modify the balance
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw from the balance
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            this.balance -= amount;
        }
    }
}

class SavingsAccount extends BankAccount {

    // Constructor to initialize savings account details
    public SavingsAccount(String accountNumber, String accountHolder, double balance) {
        super(accountNumber, accountHolder, balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        // Accessing public 'accountNumber' and protected 'accountHolder' from the parent class
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
    }
}

public class Bank {
    public static void main(String[] args) {
        // Create a new SavingsAccount object
        SavingsAccount savingsAccount = new SavingsAccount("12345", "Rohit Sharma ", 1000.0);

        // Display account details
        savingsAccount.displayAccountDetails();

        // Accessing and modifying balance
        System.out.println("Initial Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500.0);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
    }
}
