package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Colors;

public class Program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	List<Shape> list = new ArrayList<>();
	
	System.out.print("Enter the number of shapes:  ");
	Integer n = sc.nextInt();
	sc.nextLine();

	for(int i = 1 ; i<= n; i++) {
		System.out.println("");
		System.out.println("Shape #"+ i+ " Data: ");
		System.out.print("Rectangle or circle? (c/r)");
		char	shape = sc.nextLine().charAt(0);
		
		System.out.print("Color (BLACK /BLUE/ GREEN) ");
		Colors color = Colors.valueOf(sc.next());
		sc.nextLine();
		
		if (shape == 'c') {
			System.out.print("Radius: ");
			Double radius = sc.nextDouble();
			Shape c = new Circle(color, radius);
			list.add(c);
		}else if (shape == 'r') {
			System.out.print("Width: ");
		Double w =	sc.nextDouble();
		sc.nextLine();
		
		System.out.print("Height: ");
		Double h = sc.nextDouble();
		
		Shape R = new Rectangle(color, w, h);
		list.add(R);
		}
	}
	System.out.println("Shape Areas: ");
		for (Shape shape : list) {
			System.out.println(shape.area());
			 
		}
	
	}
}
