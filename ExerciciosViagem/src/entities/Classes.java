package entities;

public  class Classes implements Player{

	private String playerName;
	protected Integer level;
	protected Integer health;
	protected Integer agility;
	protected Integer mana;
	protected Integer strenght;
	protected Integer xpNeeded;
	
	
	
	public Classes() {
		
	}

	
	public Classes(String playerName, Integer level, Integer health2, Integer agility, Integer mana, Integer strenght,
			Integer xpNeeded) {
		super();
		this.playerName = playerName;
		this.level = level;
		this.health = health2;
		this.agility = agility;
		this.mana = mana;
		this.strenght = strenght;
		this.xpNeeded = xpNeeded;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public Integer getLevel() {
		return level;
	}


	public void setLevel(Integer level) {
		this.level = level;
	}


	public Double getHealth() {
		return health;
	}


	public void setHealth(Double health) {
		this.health = health;
	}


	public Integer getAgility() {
		return agility;
	}


	public void setAgility(Integer agility) {
		this.agility = agility;
	}


	public Integer getMana() {
		return mana;
	}


	public void setMana(Integer mana) {
		this.mana = mana;
	}


	public Integer getStrenght() {
		return strenght;
	}


	public void setStrenght(Integer strenght) {
		this.strenght = strenght;
	}


	public Integer getXpNeeded() {
		return xpNeeded;
	}


	public void setXpNeeded(Integer xpNeeded) {
		this.xpNeeded = xpNeeded;
	}


	public void showclasses() {
		System.out.println("  1-Mage \n 2-Warrior \n 3-Archer \n 4-Healer");
	}


	@Override
	public void dash() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void fastTravel() {
		// TODO Auto-generated method stub
		
	}
	
	
	public void printStats() {
		System.out.println(" \n Level: "+ level + "\n health: " + health + 
				"\n agility: "+ agility+ "\n strenght: " + strenght
				+ " \n mana: "+ mana);
	}

}
