package entities;

public class Products {
  String name;
 private double price;
 private int quantity;
 
 
 public Products() {
	 
 }
 
 
 public Products(String name, double price, int quantity) {
	this.name = name;
	this.price = price;
	this.quantity = quantity;
}

 
 public Products( String namea, double price) {
	 this.name = name;
	 this.price = price;

 }
 
 
 
 
 
 public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public int getQuantity() {
	return quantity;
}




public double totalValueInStock(){
	 return price * quantity;
 }
 
 public void addProducts( int quantity) {
	 this.quantity += quantity;
 }
 
 
 
 public void removeProducts(int quantity) {
	 this.quantity -= quantity;
 }
 

 
 public String toString(String name) {
	 this.name = name;
	 return "Products Data: " +
			 name + ", $ "
			 + String.format("%.2f" ,price) +
			 " And there is more " + quantity
			 + " Products";
	 
 }
}


