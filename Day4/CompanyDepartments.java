class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String toString() {
        return "Employee Name: " + name + ", Position: " + position;
    }
}

// Department Class
class Department {
    private String name;
    private Employee[] employees;
    private int employeeCount;

    public Department(String name, int maxEmployees) {
        this.name = name;
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

    public String getName() {
        return name;
    }

    public void addEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employeeCount++;
        } else {
            System.out.println("Cannot add more employees to " + name + ". Maximum limit reached.");
        }
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public int getEmployeeCount() {
        return employeeCount;
    }

    public void displayEmployees() {
        System.out.println("Employees in Department: " + name);
        for (int i = 0; i < employeeCount; i++) {
            System.out.println(" - " + employees[i]);
        }
    }
}

// Company Class
class Company {
    private String name;
    private Department[] departments;
    private int departmentCount;

    public Company(String name, int maxDepartments) {
        this.name = name;
        this.departments = new Department[maxDepartments];
        this.departmentCount = 0;
    }

    public void addDepartment(Department department) {
        if (departmentCount < departments.length) {
            departments[departmentCount] = department;
            departmentCount++;
        } else {
            System.out.println("Cannot add more departments to " + name + ". Maximum limit reached.");
        }
    }

    public void displayDepartments() {
        System.out.println("Company: " + name);
        for (int i = 0; i < departmentCount; i++) {
            System.out.println("Department: " + departments[i].getName());
            departments[i].displayEmployees();
        }
    }
}


public class CompanyDepartments {
    public static void main(String[] args) {
        // Create a Company
        Company company = new Company("Capgemini", 3);

        // Create Departments
        Department department1 = new Department("IT", 5);
        Department department2 = new Department("HR", 3);

        // Add Employees to Departments
        department1.addEmployee(new Employee("Rohit", "Software Engineer"));
        department1.addEmployee(new Employee("Mohit", "System Administrator"));

        department2.addEmployee(new Employee("Anuj", "Recruiter"));
        department2.addEmployee(new Employee("Aman", "HR Manager"));

         // Add Departments to Company
        company.addDepartment(department1);
        company.addDepartment(department2);

        // Display Company Details
        company.displayDepartments();

        // Demonstrate Composition
        System.out.println("\nDeleting the company will also delete all departments and employees.");
    }
}
