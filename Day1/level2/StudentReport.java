import java.util.Scanner;

public class StudentReport {
    String name;
    String rollNumber;
    int marks;

    public StudentReport(String name, String rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    public void grade() {
        if (marks >= 85) {
            System.out.println("Grade A ");
        } else if (marks >= 75) {
            System.out.println("Grade B ");
        } else if (marks >= 65) {
            System.out.println("Grade C ");
        } else if (marks >= 50) {
            System.out.println("Grade D ");
        } else if (marks >= 34) {
            System.out.println("Grade E ");
        } else {
            System.out.println("Grade F ");
        }
    }

    public void details() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks out of 100 : " + marks);
        grade();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking student details as input
        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        StudentReport studentReport = new StudentReport(name, rollNumber, marks);

        // Displaying student details and grade
        studentReport.details();
        sc.close();
    }
}
