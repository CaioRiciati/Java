package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
	public static void main(String [] args) {
		
		
		method1();
		System.out.println("End of program...");
	}	
	
	
	public static void method1() {
		System.out.println("**Method1 start**");
		method2();
		
		System.out.println("**Metjod1 End**");
	}
	
	
	public static void method2() {
		
		System.out.println("**Method2 start**");
		Scanner sc = new Scanner(System.in);
		try {
		String[] vect = sc.nextLine().split(" ");
		int position = sc.nextInt();
		System.out.println(vect[position]);
		}catch(InputMismatchException a) {
			System.out.println("Invalid charactere");
		}
		catch(ArrayIndexOutOfBoundsException b){
			System.out.println("Invalid number");
			
			b.printStackTrace();
		}
		
		System.out.println("**Metjod2 End**");
		

		sc.close();
	}
}
