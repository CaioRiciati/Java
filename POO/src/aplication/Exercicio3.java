package aplication;

import java.util.Scanner;

import entities.bank;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bank bk;

		System.out.println("Enter account number: ");
		int Number = sc.nextInt();
		
		System.out.println("enter account holder");	
		 String Name = sc.next();
		
		sc.nextLine();
		
		
		double Value = 0;
		System.out.println("Is there an initial deposit?  (y/n)?");
		char Answer = sc.next().charAt(0);
		if(Answer == 'n') {
			System.out.println("ok...");
			
		}else if(Answer == 'y'){
			System.out.println("enter initial depisit value: ");
			int value = sc.nextInt();
			Value += value;
		}
		bk = new bank(Number, Name, Value);
		
		System.out.println();
		System.out.println(bk.imprimir());
		
		//depositar valor na conta 
		System.out.println("enter a deposit value: ");
		double DepositV = sc.nextInt();
		System.out.println();
		System.out.println("Updated account data");
		bk.DepositValue( DepositV);
		System.out.println(bk.imprimir());
		
		
		//Valor do saque/ descontar da conta
		System.out.println("Enter a withdraw value: ");
		double WithdrawValue = sc.nextInt();
		bk.WithdrawValue(WithdrawValue);
		
		System.out.println("Updated account data:");
		System.out.println(bk.imprimir());
			
		sc.close();
		
	}
}
