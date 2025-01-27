package problemstatements.bankingsystem;

public interface Loanable {
    void applyForLoan(double loanAmount);
    double calculateLoanEligibility();
}
