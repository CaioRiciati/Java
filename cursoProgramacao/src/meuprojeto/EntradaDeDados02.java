package meuprojeto;

import java.util.Scanner;

public class EntradaDeDados02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		int x , z;
		String s1, s2, s3;
		x = sc.nextInt();
		z = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine(); //nextline para ler a linha toda e não só a palavra
		sc.close();
		
		double a = Math.sqrt(x);
		double b = Math.pow(x , z );
		double c = Math.abs(x);
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(a);
	}

}
