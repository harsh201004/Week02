class Course {
    String courseName;
    int duration;

    //constructor
    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to desplay couse details
    void displayInfo() {
        System.out.println("Course Name " + courseName);
        System.out.println("Duration " + duration);
    }
}


class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    //Constructor for couse details
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform " + platform);
        System.out.println("Recorded " + isRecorded);
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee " + fee);
        System.out.println("Discount " + discount);
    }
}

public class CourseSystem {
    public static void main(String[] args) {
        Course course = new Course("Java", 30);
        OnlineCourse onlineCourse = new OnlineCourse("Kotlin", 40, "PW", true);
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("C++", 50, "PW", false, 20000, 20);

        course.displayInfo();
        System.out.println("\n");
        onlineCourse.displayInfo();
        System.out.println("\n");
        paidOnlineCourse.displayInfo();
    }
}
