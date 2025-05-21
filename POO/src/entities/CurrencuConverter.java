package entities;

public class CurrencuConverter {
	public static double dollar = 3.10;
	public double howManyDollars;

	public double percentage() {
		double howmany = 3.10 * howManyDollars;
		double homMuch = (howmany * 6) / 100;

		return homMuch + howmany;
	}

	public String printDollar() {
		return "o valor do dolar é R$" + dollar;
	}
}
