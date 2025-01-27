import java.util.Scanner;

	class Employee {
		String name;
		int id;
		double salary;
	

	void details(){
		System.out.print("\n");
		System.out.println("Employee details: ");
		System.out.println("Name " + name );
		System.out.println("Employee id " + id );
		System.out.println("Employee salary " + salary);
		
	}
}

public class EmployeeDetails {
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		
		Employee detail = new Employee();
		
		System.out.print("Enter the name : ");
		detail.name = input.nextLine();
		
		System.out.print("Enter the employee id : ");
		detail.id = input.nextInt();
		
		System.out.print("Enter the salary : ");
		detail.salary = input.nextDouble();
		
		detail.details();	
	}
}