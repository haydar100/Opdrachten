
public class Computer extends Goed {

	public Computer(String merk, double prijs, int jaar, String tp) {
		super(merk, prijs, jaar);
		type = tp;
		
	}
	
	private String type;
	
	public double huidigeWaarde() {
		
		double uitkomst = nieuwPrijs;
		for(int i = 0; i < (2012 - bouwJaar) - 2; i++)
		{
			uitkomst = uitkomst - (uitkomst * 0.40);
		}
		
		return uitkomst;
	}
	
	public String toString() {
		return "Computer " +super.toString();
	}
	
	public String type() {
		return type();
	}
}