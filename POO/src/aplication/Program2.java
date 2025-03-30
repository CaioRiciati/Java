package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double[] vetor = new double[N];
		
		System.out.println(vetor);
		
		for(int i = 0; i<N ; i++ ) {
			vetor[i] = sc.nextDouble();
		}

		double soma = 0;
		for(int i = 0; i<N; i++) {
			soma += vetor[i];
		}
		
		soma /= N;
		System.out.printf("average height %.2f" , soma);
	}

}
