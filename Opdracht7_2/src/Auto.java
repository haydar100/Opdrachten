
public class Auto extends Goed {
	
	private String kenteken;
	public Auto(String mk, double prijs, int jaar, String ken) {
		super(mk, prijs, jaar);
		kenteken = ken;
	}
	
	public double huidigeWaarde() {
		
		double uitkomst = nieuwPrijs;
		for(int i = 0; i < (2012 - bouwJaar) - 2; i++)
		{
			uitkomst = uitkomst - (uitkomst * 0.20);
		}
		return uitkomst;
	}
	
	
	public String toString() {
		return "Auto " +super.toString();
	}
	

} 
