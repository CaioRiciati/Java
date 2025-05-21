package entities;

import java.util.Date;

public class order {
	
	private Date date;
	private Products pd;
	
	
	public order(Date date, Products pd) {
		super();
		this.date = date;
		this.pd = pd;
		this.pd.name = "TV";
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Products getProduct() {
		return pd;
	}
	public void setProduct(Products product) {
		this.pd = pd;
	}
	
	
}
