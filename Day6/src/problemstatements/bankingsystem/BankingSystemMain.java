package problemstatements.bankingsystem;

public class BankingSystemMain {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(11111, "Rohit", 50000, 4);
        BankAccount current = new CurrentAccount(22222, "Virat", 60000, 2000);

        System.out.println("Processing Savings Account:");
        savings.deposit(2000);
        savings.withdraw(1000);
        System.out.println("Interest earned: " + savings.calculateInterest());

        if (savings instanceof Loanable) {
            Loanable loanable = (Loanable) savings;
            loanable.applyForLoan(5000);
            System.out.println("Loan Eligibility: " + loanable.calculateLoanEligibility());
        }
        System.out.println("\n");

        System.out.println("Processing Current Account:");
        current.deposit(5000);
        current.withdraw(7000);
        System.out.println("Interest earned: " + current.calculateInterest());

        if (current instanceof CurrentAccount) {
            CurrentAccount ca = (CurrentAccount) current;
            ca.useOverdraft(1500);
        }
        System.out.println("\n");
    }
}
