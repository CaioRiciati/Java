package aplication;

import java.util.Scanner;

import entities.CurrencuConverter;

public class exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CurrencuConverter cc = new CurrencuConverter();

		System.out.println(cc.printDollar());

		System.out.println("How many dollar will you buy?");
		cc.howManyDollars = sc.nextInt();
		System.out.println("Amount to be paid in reais: R$" + cc.percentage());
	}

}
