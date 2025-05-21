package meuprojeto;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite 3 numeros");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a,b,c);
		showResult(higher);
		
		max d = new max;
		
		
	
	}
	 
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z) {
			aux = x;
		}
		else if(y>z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	
	public static void showResult(int value) {
		System.out.println("higher "+ value);
	}
	
}