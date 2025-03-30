package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Products2;

public class Vetor2 {
 public static void main(String[] args) {
	 Locale.setDefault(Locale.US);
	 Scanner sc = new Scanner(System.in);
	 
	 int n = sc.nextInt();
	 
	 Products2[] vetor = new Products2[n];
	 for(int i = 0 ; i< n ; i++) {
		 sc.nextLine();
		 String name = sc.nextLine();
		 double price = sc.nextDouble();
		 vetor[i] = new Products2(name,price);
	 }
	 
	 double plus = 0;
	 for(int i = 0; i<n ; i++) {
		 plus += vetor[i].getPrice();
	 }
	 	
	 plus /= n;
	 System.out.printf("Average price %.2f%n",plus);
	 System.out.println(vetor.length);
	 
	 sc.close();
 }
}
