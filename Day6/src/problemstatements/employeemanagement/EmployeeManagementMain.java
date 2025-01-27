package problemstatements.employeemanagement;

public class EmployeeManagementMain {
    public static void main(String[] args) {
        // Create a FullTimeEmployee
        FullTimeEmployee ftEmployee = new FullTimeEmployee(1, "A", 50000, 10000);
        ftEmployee.assignDepartment("Testing");

        // Create a PartTimeEmployee
        PartTimeEmployee ptEmployee = new PartTimeEmployee(2, "B", 3000, 20, 15);
        ptEmployee.assignDepartment("IT");

        // Display details of FullTimeEmployee
        System.out.println("Full-Time Employee Details ===");
        ftEmployee.displayDetails();
        System.out.println("Department: " + ftEmployee.getDepartmentDetails());
        System.out.println();

        // Display details of PartTimeEmployee
        System.out.println("Part-Time Employee Details ===");
        ptEmployee.displayDetails();
        System.out.println("Department: " + ptEmployee.getDepartmentDetails());
    }
}
