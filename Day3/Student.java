class Student1 {
    static String universityName = "RGPV";
    private static int totalStudents = 0; 

    // Final variable for a unique roll number
     final int rollNumber;
     String name;
     String grade;

    // Constructor to initialize student details
    public Student1(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++; 
    }

    // Static method to display the total number of students
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }

    // Display student details
    void displayDetails() {
        if (this instanceof Student1) {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
}

public class Student {
    public static void main(String[] args) {
        Student1 student1 = new Student1("Rohit", 101, "A");
        Student1 student2 = new Student1("Mohit", 102, "B");

        // Display student details and total students
        student1.displayDetails();
        student2.displayDetails();
        Student1.displayTotalStudents();
    }
}
