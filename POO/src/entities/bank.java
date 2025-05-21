package entities;


public class bank {
	private int AcconuntNumber;
	private String name;
	private double InitialValue;
	
	public bank(int acconuntNumber, String name, double initialValue) {
		AcconuntNumber = acconuntNumber;
		this.name = name;
		InitialValue = initialValue;
		DepositValue(InitialValue);		
	}
	
	public bank(int acconuntNumber, String name) {
		AcconuntNumber = acconuntNumber;
		this.name = name;
	}
	
	

	public int getAcconuntNumber() {
		return AcconuntNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getInitialValue() {
		return InitialValue;
	}

	
	
	
	
	public void DepositValue(double Value){
		this.InitialValue += Value;
	}
	
	public void WithdrawValue(double Withdraw){
		this.InitialValue -= Withdraw + 5;
	} 
	
	public String imprimir() {
		return "Account "+AcconuntNumber +", Holder: "
				+ name + ", Balance: $" + InitialValue;
	}
	
}
