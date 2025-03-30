package meuprojeto;

import java.util.Iterator;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		String produto1 = "tablet";
		String produto2 = "computador";
		
		int idade = 29;
		int codigo = 4124;
		char genero = 'M';
		
		double	price1 = 2700;
		double	price2 = 3800;
		double measure = 53.2147125;
		
		System.out.println("PRODUTOS:");
		System.out.printf("o %s esta no valor de R$ %.1f%n", produto1 , price1);
		System.out.printf("Já o %s esta no valor de R$ %.1f%n", produto2 , price2);
		System.out.println("");
		System.out.printf("ele tem %d anos, codigo %d e o genero é : %c%n " ,idade, codigo,genero);
		System.out.println(" ");
		System.out.printf("o numero completo é : %f%n ja ele com 3 casas deciams é %.3f%n ja com 2  %.2f%n" , measure, measure, measure);
		
		
		
		}
	}


