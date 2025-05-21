package entities;

public class Warrior  extends Classes{
	
	public Warrior() {
		super();
	}
	


	public Warrior(String playerName, Integer level, Double health, Integer agility, Integer mana, Integer strenght,
			Integer xpNeeded) {
		super(playerName, level, health, agility, mana, strenght, xpNeeded);
	}






	@Override
	public void dash() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fastTravel() {
		// TODO Auto-generated method stub
		
	}
	
	public void swordSlash() {
		this.health -= 10.0;
		System.out.println("sword slash took off 10 LP");
	}
	
}
