import java.util.ArrayList;

class Course {
    private String courseName;
    private Professor professor;
    private ArrayList<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(" - " + student.getName());
        }
    }
}

// Student Class
class Student {
    private String name;
    private ArrayList<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this); 
    }

    public void displayEnrolledCourses() {
        System.out.println("Student: " + name + " is enrolled in the following courses:");
        for (Course course : courses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}

// Professor Class
class Professor {
    private String name;
    private ArrayList<Course> taughtCourses;

    public Professor(String name) {
        this.name = name;
        this.taughtCourses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void assignCourse(Course course) {
        taughtCourses.add(course);
        course.assignProfessor(this); 
    }

    public void displayTaughtCourses() {
        System.out.println("Professor: " + name + " teaches the following courses:");
        for (Course course : taughtCourses) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}


public class UniversityManagement {
    public static void main(String[] args) {
      
        Professor professor1 = new Professor("Dr. A");
        Professor professor2 = new Professor("Dr. B");

        //  Courses
        Course course1 = new Course("DSA");
        Course course2 = new Course("ML");

        // Assign Professors to Courses
        professor1.assignCourse(course1);
        professor2.assignCourse(course2);

        
        Student student1 = new Student("C");
        Student student2 = new Student("D");

        // Enroll Students in Courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course1);

        // Display Courses and Professors
        course1.displayCourseDetails();
        System.out.println();
        course2.displayCourseDetails();
        System.out.println();

        // Display Students and their Enrolled Courses
        student1.displayEnrolledCourses();
        System.out.println();
        student2.displayEnrolledCourses();
        System.out.println();

        // Display Professors and their Courses
        professor1.displayTaughtCourses();
        System.out.println();
        professor2.displayTaughtCourses();
    }
}
