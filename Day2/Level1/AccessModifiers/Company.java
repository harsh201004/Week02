class Employee {
    public String employeeID;
    protected String department;
    private double salary;

    // Constructor to initialize employee details
    public Employee(String employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Method to modify salary
    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    // Method to get the current salary
    public double getSalary() {
        return this.salary;
    }
}

class Manager extends Employee {

    // Constructor to initialize manager details
    public Manager(String employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    // Method to display employee and department details
    public void displayDetails() {
        // Accessing public 'employeeID' and protected 'department' from the parent class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

public class Company {
    public static void main(String[] args) {
        // Creating a Manager object
        Manager manager = new Manager("M123", "Sales", 75000.0);

        // Displaying employee details
        manager.displayDetails();

        // Modifying and displaying salary
        System.out.println("Initial Salary: " + manager.getSalary());
        manager.setSalary(80000.0);
        System.out.println("Updated Salary: " + manager.getSalary());
    }
}
