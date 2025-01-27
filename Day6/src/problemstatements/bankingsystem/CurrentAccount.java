package problemstatements.bankingsystem;

public class CurrentAccount extends BankAccount{
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, String holderName, double balance, double overdraftLimit) {
        super(accountNumber, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    //Override
    public double calculateInterest() {
        return 0;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    public void useOverdraft(double amount) {
        if (amount > 0 && amount <= overdraftLimit) {
            overdraftLimit -= amount;
            System.out.println("Overdraft used: " + amount + ". Remaining overdraft limit: " + overdraftLimit);
        } else {
            System.out.println("Invalid overdraft amount or exceeded limit!");
        }
    }
}
