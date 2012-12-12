
public class Huis extends Goed {
	public Huis(String merk, double prijs, int jaar, int oppo) {
		super(merk, prijs, jaar);
		oppo = oppervlakte;
	}
	
	private int oppervlakte;
	
	public double huidigeWaarde() {
		
		double uitkomst = nieuwPrijs;
		for(int i = 0; i < (2012 - bouwJaar) - 2; i++)
		{
			uitkomst = uitkomst + (uitkomst * 0.05);
		}
		
		return uitkomst;
	}

	public String toString() {
		return "Huis " +super.toString();
	}
}
