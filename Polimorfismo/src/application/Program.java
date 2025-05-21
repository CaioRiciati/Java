package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.println("Enter the number of employees: ");
		
		Integer EmpNum = sc.nextInt();
		
		for(int i = 1 ; i <= EmpNum; i++) {
			System.out.println("Employee #"+ i + "Data: ");
			System.out.println("Outsourced? (y/n) ");
			char yn = sc.next().charAt(0);
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Hours:");
			Integer hours = sc.nextInt();
			
			System.out.println("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();
			
			if(yn == 'y') {
				System.out.println("Additional charge:");
					Double additionalDouble = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalDouble);
				list.add(emp);
			}else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
			
		}
	
		System.out.println();
		System.out.println("Payments");
		for (Employee emp: list) {
			System.out.println(emp.getName()+  " - $"+ emp.payment());
		}
		sc.close();
	}
}
