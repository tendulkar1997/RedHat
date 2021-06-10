package abc.model.App;

import java.util.Scanner;

import abc.model.Employee;
import abc.model.Manager;
import abc.model.Engineer;
import static java.lang.System.out;
import static java.lang.System.in;
import static abc.model.Employee.max;
import static java.lang.Math.PI;
import static abc.model.HOORLY_PAID;
import static abc.model.EmployeeType.SALARIED;

public class App {
	
//	private static Scanner scanner=new Scanner(System.in);
	private static Scanner scanner=new Scanner(in);
	private Employee[] employees;
	
	{
		employees=new Employee[5];
	}
	public static void main(String args[])
	{
		int a=max;
		System.out.println(a);
		System.out.println(PI);
		App app=new App();
		app.employees[0]=new Employee(10, "John", "Doe", "john@email.com",SALARIED);
		app.employees[1]=new Manager(20, "Marry", "Public", "marry@email.com", HOORLY_PAID,"Sales");
		app.employees[2]=new Engineer(30, "Sachin", "Tendulkar", "sachin@email.com", SALARIED, "Mechanical");
		
		
		//enhanched for loop
		for(Employee employee : app.employees)
		{
			System.out.println(employee);
		}
		
		//standard for loop
		for(int i=0;i<app.employees.length;i++)
		{
			out.println(app.employees[i]);
		}
		
	}
//		
//	
//	 public static void main(String args[])
//	    {
//	        int id;
//	        String name;
//	        String emailID;
//	       
//	        String Department;
//	        Scanner s=new Scanner(System.in);
//	        
//	        System.out.println("Enter Employee Id:");
//	        id = s.nextInt();
//	 
//	        System.out.println("Enter Employee  First name:");
//	        name = s.nextLine(); 
//	        
//	        System.out.println("Enter Employee Last name:");
//	        name = s.nextLine(); 
//	 
//	        System.out.println("Enter EmailID:");
//	        emailID = s.nextLine();
//	 
//	        System.out.println("Enter Department:");
//	        Department = s.nextLine();
//	 
//	        // Printing employee Details
//	        System.out.println("Employee  details:");
//	        System.out.println("Employee  id is: " +id);
//	        System.out.println("Employee  Fname is: " +name);
//	        System.out.println("Employee  Lname is: " +name);
//	       
//	        System.out.println("Employee  Department is: " +Department);
//	        s.close();
//	    }
	
	
	
}
