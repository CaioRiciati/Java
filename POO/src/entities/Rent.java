package entities;

public class Rent {
    private String name;
    private String email;

    // Construtor que aceita nome e email
    public Rent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Getters para acessar os atributos (opcional)
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

	@Override
	public String toString() {
		return "name= " + name + ", email= " + email;
	}

    
    
}