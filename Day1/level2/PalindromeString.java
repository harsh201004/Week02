import java.util.Scanner;

class Palindrome {
    private String text;

    // Constructor
    public Palindrome(String text) {
        this.text = text;
    }

    // Method to check if the text is a palindrome
    public boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed); // Ignore case sensitivity
    }

    // Method to display the result
    public void displayResult() {
        if (isPalindrome()) {
            System.out.println("The string \"" + text + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + text + "\" is not a palindrome.");
        }
    }
}

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Creating a PalindromeChecker object
        Palindrome checker = new Palindrome(input);

        // Displaying the result
        checker.displayResult();
        sc.close();
    }
}
