package entities;

import java.util.Date;

public final class Usedproduct extends Product {
	private Date manufactureDate;
	
	public Usedproduct() {
		
	}

	public Usedproduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return getName()+ " (Used) $"+ getPrice()+ "(Manufacture date: "+ manufactureDate + ")";
	}
}
