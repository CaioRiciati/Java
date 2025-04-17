package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Entities.enums.OrderStatus;

public class Order {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	 
	private Date moment;
	private OrderStatus ProductStatus;

	private List<OrderItem> items = new ArrayList<OrderItem>();
	

	public Order() {
	
	}

	public Order(Date moment, OrderStatus productStatus) {
		this.moment = moment;
		ProductStatus = productStatus;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getProductStatus() {
		return ProductStatus;
	}

	public void setProductStatus(OrderStatus productStatus) {
		ProductStatus = productStatus;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		return  sb.toString();
	} 
	
	
	
}
	
	
