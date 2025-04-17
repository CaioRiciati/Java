package Entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private String Email;
	private Date birthDate;
	
	public Client() {
		
	}

	public Client(String name, String email, Date birthDate) {
		this.name = name;
		Email = email;
		this.birthDate = birthDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return name + "(" + sdf.format(birthDate)+ ") -" + Email ;
	}
	
	
	
}
