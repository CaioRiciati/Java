package entities;

public class Mage extends Classes {

	public Mage() {
		super();
	}
	
	public Mage(String playerName, Integer level, Double health, Integer agility, Integer mana, Integer strenght,
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
	
	public void fireBall() {
		this.mana -= 7;
	}
	
	public void areaBuff() {
		this.mana -= 15;
		this.strenght += 7;
		this.agility += 7;
	}

}
