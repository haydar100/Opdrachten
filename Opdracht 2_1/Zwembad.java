public class Zwembad {
	private double breedte;
	private double lengte;
	private double diepte;

public Zwembad(){
}


public Zwembad (double br, double lg, double dp) {
	breedte = br;
	lengte = lg;
	diepte = dp;
}

public double getBreedte(){
	return breedte;
}

public double getLengte(){
	return lengte;
}

public double getDiepte(){
	return diepte;
}

public void setBreedte(double nwbr) {
	breedte = nwbr;
}

public void setLengte(double nwlg) {
	lengte = nwlg;
}

public void setDiepte(double nwdp) {
	diepte = nwdp;
}

public double inhoud(){
	return (lengte * breedte * diepte);
}

public String toString() {
	String s = "Dit zwembad is " + breedte + " meter breed," + lengte + " meter lang, en " + diepte + " meter diep";
	return s;
}
}






