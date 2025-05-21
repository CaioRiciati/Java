package aplication;

import java.util.ArrayList;
import java.util.List;

public class ListJava {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("Caio");
		list.add("Andre");
		list.add("Anna");
		list.add("Marcos");
		list.add(2,"Jose");
		

		for(String i: list) {
			System.out.println(i);
		}
		
		System.out.println("------------------");
		
		list.removeIf(i -> i.charAt(0) != 'A' );
		for(String i: list) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		String name = list.stream().filter(i -> i.charAt(0) == 'Q').findFirst().orElse("N tem nenhum n");
		System.out.println(name);
		
	}
}
