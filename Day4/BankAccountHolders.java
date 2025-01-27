class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient balance for withdrawal.");
        }
    }
}

class Customer {
    private String name;
    private Account[] accounts;
    private int accountCount;

    public Customer(String name, int maxAccounts) {
        this.name = name;
        this.accounts = new Account[maxAccounts];
        this.accountCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addAccount(Account account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
        } else {
            System.out.println("Cannot add more accounts. Maximum limit reached.");
        }
    }

    public void viewBalance() {
        System.out.println("Account Balances for " + name + ":");
        for (int i = 0; i < accountCount; i++) {
            System.out.println(" - Account " + accounts[i].getAccountNumber() + ": " + accounts[i].getBalance());
        }
    }
}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, Account account) {
        customer.addAccount(account);
        System.out.println("Account " + account.getAccountNumber() + " opened for " + customer.getName() + " at " + name + ".");
    }

    public String getName() {
        return name;
    }
}

// Main Class
public class BankAccountHolders {
    public static void main(String[] args) {
        // Create a Bank
        Bank bank = new Bank("SBI");

        // Create Customers
        Customer customer1 = new Customer("Harsh", 2);
        Customer customer2 = new Customer("Kuldeep", 2);

        // Open Accounts
        Account account1 = new Account(101, 1000);
        Account account2 = new Account(102, 2500);
        Account account3 = new Account(103, 5500);

        // Associating Accounts with Customers
        bank.openAccount(customer1, account1);
        bank.openAccount(customer1, account2);
        bank.openAccount(customer2, account3);

        // Customer Views Balances
        customer1.viewBalance();
        customer2.viewBalance();

        // Perform Transactions
        System.out.println("\nTransactions on Harsh's Account 101:");
        account1.deposit(3000);
        account1.withdraw(2000);

        System.out.println("\nTransactions on Kuldeep's Account 103:");
        account3.withdraw(8000); // Insufficient balance
        account3.deposit(500);
    }
}
