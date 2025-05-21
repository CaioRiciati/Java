package entities;

public class Employee {
	public String name;
	public double GrossSalary;
	public double Tax;

	public double increaseSalary(int percentage) {
		double port = (this.GrossSalary * percentage) / 100;
		port += this.GrossSalary;
		return port;

	}

	public double NetSalary() {
		return this.GrossSalary - this.Tax;
	}

	public String toString() {
		return "Employee: " + name + ", $";
	}
}
