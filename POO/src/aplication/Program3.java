package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee2;

public class Program3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee2> list = new ArrayList<>();
		
		
		System.out.println("How many employees will be registered?");
		
		int n = sc.nextInt();
		
		for(int i = 0; i<n ; i++) {
			System.out.println("Employee #" + (i+1) + ":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();
					
			
			Employee2 emp = new Employee2(id, name, salary);
			
			list.add(emp);
			
				
			}
		
		System.out.println("Enter de employee id that will have a salary increase : ");
		int idSalary = sc.nextInt();
		Integer pos = Position(list, idSalary);
		if(pos == null) {
			System.out.println("This id don't exist");
		}
		else {
			System.out.println("Enter the percentage: ");
			int percentage = sc.nextInt();
			list.get(pos).increaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of Employees");			
		for (Employee2 emp : list) {
			System.out.println(emp);
		}
		
		sc.close();
		}
	
	
	
	
	public static Integer Position(List<Employee2> list , int id) {
		 for(int i =0; i< list.size(); i++) {
			 if(list.get(i).getId() == id) {
				 return i;
			 }
			 
		 }
		 return null;
		 
		 
	}
}


