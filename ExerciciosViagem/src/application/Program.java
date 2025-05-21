package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Classes;

public class Program {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	Integer level = 1;
	Integer health = 20;
	Integer agility = 10;
	Integer mana = 50;
	Integer strenght = 6;
	Integer xpNeeded = level * 100;
	String Class = null;
	
	

	
	System.out.println("Welcome to dark's RPG, first of all");
	System.out.println();
	System.out.println("what's your character name??");
	String Pname = sc.nextLine();
	Classes cl = new Classes(Pname, level,health, agility, mana, strenght, xpNeeded);
	

	
	
	System.out.println("Choose between this classes using numbers: ");
	cl.showclasses();
	Integer chooseClass = sc.nextInt();
	
	switch (chooseClass) {
	case 1:
		Class = "Mage";
		Integer manaBuff =50;
		mana += manaBuff;
		strenght += 5;
		System.out.println("Congratulations, now you're a Mage!!");
		break;
		
	case 2:
		health += 30;
		strenght += 10;
		Class = "Warrior";
		System.out.println("Congratulations, now you're a Warrior!!");
		break;
		
	case 3:
		
		Class ="Archer";
		System.out.println("Congratulations, now you're a Archer!!");
		break;
		
	case 4:
		Class ="Healer";
		System.out.println("Congratulations, now you're a Healer!!");
		break;
	default:
		break;
	}
	
	
	System.out.print("your stats are");
	cl.printStats();
	

	sc.close();
	}
}
