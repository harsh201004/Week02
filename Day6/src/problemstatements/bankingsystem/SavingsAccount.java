package problemstatements.bankingsystem;

class SavingsAccount extends BankAccount implements Loanable{
    private double interestRate;

    public SavingsAccount(int accountNumber, String holderName, double balance, double interestRate) {
        super(accountNumber, holderName, balance);
        this.interestRate = interestRate;
    }

    //Override
    public double calculateInterest() {
        return getBalance() * interestRate / 100;
    }

    //Override
    public void applyForLoan(double loanAmount) {
        System.out.println("Loan applied for Savings Account: " + loanAmount);
    }

    //Override
    public double calculateLoanEligibility() {
        return getBalance() * 2;
    }
}
