import java.util.ArrayList;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Faculty Name: " + name;
    }
}

// Department Class
class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Department: " + name;
    }
}

// University Class
class University {
    private String name;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Add Department (Composition)
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Add Faculty (Aggregation)
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    // Display Departments
    public void displayDepartments() {
        System.out.println("Departments in " + name + ":");
        for (Department department : departments) {
            System.out.println(" - " + department);
        }
    }

    // Display Faculties
    public void displayFaculties() {
        System.out.println("Faculties in " + name + ":");
        for (Faculty faculty : faculties) {
            System.out.println(" - " + faculty);
        }
    }

    // Delete University
    public void deleteUniversity() {
        System.out.println("\nDeleting University: " + name);
        departments.clear(); 
        faculties.clear(); 
        System.out.println("All departments have been deleted.");
        System.out.println("Faculties remain independent.");
    }
}


public class UniversityWithFacultiesAndDepartments {
    public static void main(String[] args) {
        // Create a University
        University university = new University("RGPV");

        // Create Departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("IT");

        // Add Departments to University
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Create Faculties
        Faculty faculty1 = new Faculty("Dr. A");
        Faculty faculty2 = new Faculty("Dr. B");
        Faculty faculty3 = new Faculty("Dr. C");

        // Add Faculties to University
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);
        university.addFaculty(faculty3);

        // Display University Information
        university.displayDepartments();
        System.out.println();
        university.displayFaculties();
        System.out.println();

        // Delete the University
        university.deleteUniversity();
    }
}
