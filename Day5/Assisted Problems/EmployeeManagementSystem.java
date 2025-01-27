class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    private int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    public int getTeamSize() {
        return teamSize;
    }

    //Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    //Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private int internshipDuration; 

    Intern(String name, int id, double salary, int internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }

    public int getInternshipDuration() {
        return internshipDuration;
    }

    //Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Internship Duration: " + internshipDuration + " months");
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create objects of different employee types
        Employee manager = new Manager("A", 1, 90000, 5);
        Employee developer = new Developer("B", 2, 80000, "Java");
        Employee intern = new Intern("C", 3, 30000, 2);

        // Display details of all employees
        
        manager.displayDetails();
        System.out.println();

        developer.displayDetails();
        System.out.println();

        intern.displayDetails();
    }
}
