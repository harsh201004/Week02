class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Number " + accountNumber);
        System.out.println("Balance " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Savings Account");
        System.out.println("Interest Rate " + interestRate);
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Checking Account");
        System.out.println("Withdrawal Limit " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int maturityPeriod;

    FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    void displayAccountType() {
        super.displayAccountType();
        System.out.println("Account Type Fixed Deposit Account");
        System.out.println("Maturity Period " + maturityPeriod);
    }
}

public class BankSystem2 {
    public static void main(String[] args) {
        BankAccount savingsAccount = new SavingsAccount("SBIN111", 200000, 3);
        BankAccount checkingAccount = new CheckingAccount("SBI222", 450000, 10000);
        BankAccount fixedDepositAccount = new FixedDepositAccount("SBI333", 1000000, 12);

        savingsAccount.displayAccountType();
        checkingAccount.displayAccountType();
        fixedDepositAccount.displayAccountType();
    }
}
