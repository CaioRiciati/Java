package application;

import java.io.File;
import java.util.Scanner;

public class InfoCaminhoArquivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: "+ path.getName());
		System.out.println("getParent: "+ path.getParent());
		System.out.println("getParent: "+ path.getPath());
		
		
		sc.close();
	}

}
