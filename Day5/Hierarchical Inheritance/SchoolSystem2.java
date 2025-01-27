class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayRole() {
        System.out.println(this.name + " is a person.");
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a teacher who teaches " + this.subject + ".");
    }
}

class Student extends Person {
    int grade;

    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a student in grade " + this.grade + ".");
    }
}

class Staff extends Person {
    String position;

    public Staff(String name, int age, String position) {
        super(name, age);
        this.position = position;
    }

    @Override
    public void displayRole() {
        System.out.println(this.name + " is a staff member with the position of " + this.position + ".");
    }
}

public class SchoolSystem2 {
    public static void main(String[] args) {
        Person person = new Person("ABC", 25);
        Teacher teacher = new Teacher("x", 28, "Math");
        Student student = new Student("y", 20, 12);
        Staff staff = new Staff("z", 30, "Developer");

        person.displayRole();

        teacher.displayRole();

        student.displayRole();

        staff.displayRole();
    }
}
