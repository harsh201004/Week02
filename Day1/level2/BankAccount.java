public class BankAccount {
    String accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if(amount > 0) {
            balance += amount;
            System.out.println("Amount deposited successfully");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully");
        }else if(amount > balance){
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void currentBalance() {
        System.out.println("Account Balance: " + balance);
    }

    public void accountDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        currentBalance();
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789","John", 1000.00);
        
        // Display initial balance
        account.accountDetails();
        
        // Deposit money
        account.deposit(500.00);
        
        // Withdraw money
        account.withdraw(300.00);
        
        account.withdraw(1500.00);
        System.out.println("\n");
        // Display balance
        account.accountDetails();
    }
}
