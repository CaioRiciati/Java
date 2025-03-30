package aplication;

import java.util.Scanner;

import entities.Products;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

			String[] vect = new String[] {"caio", "maria", "alex"};	
			
			for(int i  = 0; i< vect.length; i++) {
				System.out.println(vect[i]);
				
			}
		
			System.out.println("################");
			
			for(String vetz : vect) {
				System.out.println(vetz);
			}
		 
}

}
