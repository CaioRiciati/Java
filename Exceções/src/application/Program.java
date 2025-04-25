package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		
		try {
		System.out.print("Number: ");
		Integer number= sc.nextInt();
		sc.next();
		System.out.print("Holder: ");
		String Holder = sc.nextLine();
		
		System.out.print("Initial Balance: ");
		Double balance =sc.nextDouble();
		sc.next();
		
		System.out.print("Withdraw Limit: ");
		Double withdrawLimit =sc.nextDouble();
		} catch (MatchException e) {
			// TODO: handle exception
		}
		
		
		
		
		sc.close();
	}
}
