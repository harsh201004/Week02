package problemstatements.employeemanagement;

class PartTimeEmployee extends Employee implements Department{
    private String departmentName;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId,String name,double baseSalary, double hourlyRate, int hoursWorked) {
        super(employeeId,name,baseSalary);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }
    public String getDepartmentDetails() {
        return departmentName;
    }
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
