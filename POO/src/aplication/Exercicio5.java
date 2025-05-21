package aplication;

import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas linhas");
		int a = sc.nextInt();
		System.out.println("Quantas colunas?");
		int b = sc.nextInt();
		
		int [][] cordenadas = new int[a][b];
			
		for(int i = 0; i< cordenadas.length; i++) {
			for(int j = 0; j< cordenadas[i].length; j++) {
				cordenadas[i][j] = sc.nextInt();
				
			}
			
		}
		
		System.out.println("Qual numero vc quer procurar?");
		int qualNumero = sc.nextInt();
		
		System.out.println("sobre: ");
		for(int i = 0; i< cordenadas.length; i++) {
			for(int j = 0; j< cordenadas[i].length; j++) {
		
				
				if(cordenadas[i][j] == qualNumero) {
					System.out.println("Position: "+ (i+1) + ", "+ (j+1));
					
					if (i > 0) {
						System.out.println("up: " + cordenadas[i - 1][j] );
						
					}
					
					if (i > cordenadas[i].length - 1) {
						System.out.println("down: "+ cordenadas[i+1][j]);
						
					}
					
					
					if(j> cordenadas[i].length-1) {
						System.out.println("Right: "+ cordenadas[i][j + 1]);
					}
					
					if (j>0) {
						System.out.println("Left: "+ cordenadas[i][j-1] );
						
					}
					
				}
				
			}
		}
		sc.close();
	}
}

