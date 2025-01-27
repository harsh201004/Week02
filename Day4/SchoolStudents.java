import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        if (!enrolledStudents.contains(student)) {
            enrolledStudents.add(student);
            student.addCourse(this);
        }
    }

    public void displayEnrolledStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> enrolledCourses;

    public Student(String name) {
        this.name = name;
        this.enrolledCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    public void displayCourses() {
        System.out.println(name + " is enrolled in the following courses:");
        for (Course course : enrolledCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// School Class
class School {
    private String schoolName;
    private ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        }
    }

    public void displayStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student student : students) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Main Class
public class SchoolStudents {
    public static void main(String[] args) {
        // Create a School
        School school = new School("ABPS");

        // Create Students
        Student student1 = new Student("A");
        Student student2 = new Student("B");
        Student student3 = new Student("C");

        // Add Students to the School
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        // Create Courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");
        Course history = new Course("Arts");

        // Enroll Students in Courses
        math.enrollStudent(student1);
        math.enrollStudent(student2);

        science.enrollStudent(student1);
        science.enrollStudent(student3);

        history.enrollStudent(student2);

        // Display School Students
        school.displayStudents();
        System.out.println();

        // Display Enrolled Courses for Each Student
        student1.displayCourses();
        System.out.println();
        student2.displayCourses();
        System.out.println();
        student3.displayCourses();
        System.out.println();

        // Display Students Enrolled in Each Course
        math.displayEnrolledStudents();
        System.out.println();
        science.displayEnrolledStudents();
        System.out.println();
        history.displayEnrolledStudents();
    }
}
