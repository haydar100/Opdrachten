import java.text.*;

public abstract class Goed {
	protected NumberFormat nf = NumberFormat.getInstance();
	protected String merk;
	protected double nieuwPrijs;
	protected int bouwJaar;
	
	public Goed(String mk, double prijs, int jaar) {
		merk = mk;
		nieuwPrijs = prijs;
		bouwJaar = jaar;
	}
	public abstract double huidigeWaarde();
	public String toString()
	{
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		return merk + "; nieuwprijs: " + nieuwPrijs + "; bouwjaar: " + bouwJaar + "; met huidige waarde: " + nf.format(huidigeWaarde());
	}
	
}

