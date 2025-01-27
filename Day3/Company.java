class Employee {
    // Static variables
    static String companyName = "Capgemini";
    static int totalEmployees = 0;

    // Instance variables
     final String employeeID; 
     String department;    
     double salary;

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID; 
        this.department = department;
        this.salary = salary;        
        totalEmployees++;             
    }

    // Static method to display total employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }

    // Static method to display company name
    public static void displayCompanyName() {
        System.out.println("Company Name: " + companyName);
    }

    // Getter and setter for salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public double getSalary() {
        return this.salary;
    }

    // Method to display details (with instanceof check)
    public void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Employee ID: " + employeeID);
            System.out.println("Department: " + department);
            System.out.println("Salary: " + salary);
        } else {
            System.out.println("Not a valid Employee instance.");
        }
    }
}

// extending Employee class
class Manager extends Employee {
    private String team;

    // Constructor to initialize manager details
    public Manager(String employeeID, String department, double salary, String team) {
        super(employeeID, department, salary); // Call to parent class constructor
        this.team = team; // Additional property for managers
    }

    // Overridden method to display manager-specific details
    
    public void displayDetails() {
        super.displayDetails(); 
        System.out.println("Team: " + team);
    }
}

// Main class for Employee Management System
public class Company {
    public static void main(String[] args) {
        // Display company name
        Employee.displayCompanyName();

        // Create instances of Employee and Manager
        Employee emp1 = new Employee("E101", "Finance", 50000.0);
        Manager manager = new Manager("M123", "Sales", 75000.0, "Sales Team A");

        // Display total employees
        Employee.displayTotalEmployees();

        //emp1
        System.out.println("\nEmployee 1 Details:");
        emp1.displayDetails();

        // Update salary for emp1
        System.out.println("\nUpdating Employee 1 Salary...");
        emp1.setSalary(55000.0);
        emp1.displayDetails();

        // details of the manager
        System.out.println("\nManager Details:");
        manager.displayDetails();

        // Update manager's salary
        System.out.println("\nUpdating Manager's Salary...");
        manager.setSalary(80000.0);
        manager.displayDetails();

        // Display total employees again
        System.out.println("\nUpdated Total Employees:");
        Employee.displayTotalEmployees();
    }
}
