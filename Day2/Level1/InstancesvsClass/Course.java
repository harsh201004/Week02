public class Course {
    // Instance variables
    String courseName;
     int duration; // Duration in days or months
     double fee;

    // Class variable (common for all courses)
    public static String instituteName = "Generic Institute";

    // Constructor to initialize the course
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: $" + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class method to update institute name
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the Course class
    public static void main(String[] args) {
        // Creating course objects
        Course course1 = new Course("Java Programming", 3, 299.99);
        Course course2 = new Course("Web Development", 4, 399.99);
        Course course3 = new Course("Data Science", 6, 499.99);

        // Displaying course details
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();

        // Updating the institute name
        System.out.println("\nUpdating Institute Name...\n");
        Course.updateInstituteName("Advanced Tech Academy");

        // Displaying course details after institute name update
        course1.displayCourseDetails();
        course2.displayCourseDetails();
        course3.displayCourseDetails();
    }
}
