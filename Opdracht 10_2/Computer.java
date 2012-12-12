import java.text.*;

public class Computer{
	protected String merk;
	protected String type;
	protected double aanschafprijs;
	protected int aanschafjaar;

	public Computer(String mk, double prijs, int jaar, String tp){
		merk=mk;
		aanschafprijs=prijs;
		aanschafjaar=jaar;
		type=tp;
	}
	public double huidigeWaarde(){
		int ouderdom=2011-aanschafjaar;
		double huidigePrijs=aanschafprijs;
		for(int i=0;i<ouderdom;i++){
			huidigePrijs=huidigePrijs*0.6;
		}
		return huidigePrijs;
	}
	public String toString(){
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		return "\nmerk = "+merk+" en type = "+type+"; nieuwprijs = "+aanschafprijs+" huidige waarde = "+nf.format(huidigeWaarde());
	}
}