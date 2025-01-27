// Base class: Student
 class Student {
    // Instance variables
    public int rollNumber;  // Public variable (can be accessed directly)
    protected String name;   // Protected variable (accessible by subclasses)
    private double CGPA;     // Private variable (not directly accessible outside the class)

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public getter method for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public setter method for CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0.0 && CGPA <= 10.0) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA. It should be between 0.0 and 10.0.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor for PostgraduateStudent
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        // Calling the superclass (Student) constructor
        super(rollNumber, name, CGPA);
    }

    // Method to display PostgraduateStudent details and demonstrate the use of protected members
    public void displayPostgraduateDetails() {
        System.out.println("Postgraduate Student Details:");
        System.out.println("Roll Number: " + rollNumber);  // Accessing public variable directly
        System.out.println("Name: " + name);              // Accessing protected variable
        System.out.println("CGPA: " + getCGPA());         // Using getter method to access private variable
    }
}

// Main class to test the program
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Creating a Student object
        Student student1 = new Student(101, "Mohit", 9.2);
        student1.displayStudentDetails();

        // Modifying CGPA using setter method
        student1.setCGPA(9.5);
        System.out.println("Updated CGPA for Mohit: " + student1.getCGPA());

        // Creating a PostgraduateStudent object
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "ROhit", 8.7);
        pgStudent.displayPostgraduateDetails();

        // Modifying CGPA using setter method
        pgStudent.setCGPA(9.1);
        System.out.println("Updated CGPA for Rohit: " + pgStudent.getCGPA());
    }
}
