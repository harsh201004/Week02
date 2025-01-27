class BankAccount {
    // Static variables
    static String bankName = "SBI";
    static int totalAccounts = 0;

    // Instance variables
    final int accountNumber;
     String accountHolderName; // Protected to allow access in subclass
     double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++;
    }

    // Static methods
    public static String getBankName() {
        return bankName;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    // Instance methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Successfully withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    // Constructor for SavingsAccount
    public SavingsAccount(int accountNumber, String accountHolderName, double initialBalance) {
        super(accountNumber, accountHolderName, initialBalance); // Call parent constructor
    }

    // Method
    public void displayAccountDetails() {
        System.out.println("Savings Account Details:");
        displayDetails(); 
    }
}

public class Bank {
    public static void main(String[] args) {
        // Creating objects
        SavingsAccount account1 = new SavingsAccount(1001, "John Doe", 5000.0);
        SavingsAccount account2 = new SavingsAccount(1002, "Jane Smith", 10000.0);

        // Displaying total accounts
        System.out.println("Total Accounts: " + BankAccount.getTotalAccounts());

        // Display account 1 details
        System.out.println("\nAccount 1 Details:");
        account1.displayAccountDetails();

       
        account1.deposit(2000);
        account1.withdraw(1500);
        account1.displayAccountDetails();

        // Display account 2 details
        System.out.println("\nAccount 2 Details:");
        account2.displayAccountDetails();
    }
}
