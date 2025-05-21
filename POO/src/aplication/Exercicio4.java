package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Exercicio4 {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Rent[] vect = new Rent[10];
	
	int manyPeople = sc.nextInt();
	
	if(manyPeople > 10) {
		
	}else {
		
	}
	
for(int i = 1; i <= manyPeople; i++) {
	System.out.println();
	System.out.println("Rent #"+ i+ ":");
	System.out.print("Name: ");
	sc.nextLine();
	String name = sc.nextLine();
	System.out.print("Email ;");
	String Email = sc.next();
	System.out.println("Room ; ");
	int roomNumber = sc.nextInt();
	
	
	Rent rent = new Rent(name, Email);
	
	vect[roomNumber] = rent;
}
	System.out.println();
	System.out.println("Busy rooms");
	
	for(int i = 0; i< 10; i++) {
		if(vect[i] != null ) {
			System.out.println("Quarto "+i + ": " +vect[i]);
		}
	
}
	
sc.close();
	
	}
}
