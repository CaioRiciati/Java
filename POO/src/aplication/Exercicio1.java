package aplication;

import java.util.Scanner;

import entities.Employee;

public class Exercicio1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Employee ep = new Employee();
	
	System.out.println("Employee name: ");
	ep.name = sc.nextLine();
	
	System.out.println("Employee gross salary");
	ep.GrossSalary =sc.nextInt();
	
	System.out.println("Employee salary tax");
	ep.Tax = sc.nextInt();
	
	System.out.println(ep.toString() + ep.NetSalary());
	
	System.out.println("Which percentage to increase salary?");
	
	
	int percentage = sc.nextInt();
	System.out.println("Updated "+ ep.toString()+ ep.increaseSalary(percentage));
}
}


