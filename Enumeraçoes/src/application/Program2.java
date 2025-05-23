package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class Program2 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter department's name: ");
		String departmentName = sc.nextLine();
		
		System.out.println("Enter worker data: ");
		System.out.println("name");
		String name = sc.nextLine();
		
		System.out.println("Level: ");
		String workerLevel = sc.nextLine();
		
		
		System.out.println("Base Salary: ");
		double baseSalary = sc.nextDouble();
		
		Worker wk = new Worker(name,  WorkerLevel.valueOf(workerLevel), baseSalary,new Department (departmentName));
		
		  System.out.println("How many conctracts to this worker?:  ");
		  
		  int n = sc.nextInt();
		  for(int i=1; i<= n; i++) {
			  	System.out.println("enter contract #"+ i + "data:");
			  	System.out.print("Date (DD/MM/YYYY)");
			  	Date contractDate = sdf.parse(sc.next());
			  	
			  	System.out.print("Value per hour:");
			  	double valuePerHour = sc.nextDouble();
			  	
			  	System.out.println("Duration (hours) :");
			  	int hours = sc.nextInt();
			  	
			  	HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			  	
			  	wk.addContract(contract);
		  }
		  
		  
		  System.out.println();
		  System.out.print("Enter month and year to calculate income (MM/YYY): ");
		  String monthAndYear = sc.next();
		  int month = Integer.parseInt(monthAndYear.substring(0,2));
		  int Year = Integer.parseInt(monthAndYear.substring(3));
		  
		  System.out.println("name: "+ wk.getName());
		  System.out.println("Department: "+ wk.getDepartment().getName());
		  System.out.println("Income for "+ monthAndYear + ": " + String.format("%.2f" , wk.income(Year, month)));
		sc.close();
	}

}
