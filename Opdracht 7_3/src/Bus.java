
public class Bus extends Vehicle {
	
	public Bus(int maxG, int aS) {
		super(maxG);
		aantalStoelen = aS;
	}
	private int aantalStoelen; 
	
	public int getAantalStoelen() {
		return aantalStoelen;
	}
	public String toString() {
		return " Bus met huidige versnelling: "+gearNow+" en max: "+maxGears;
	}
	
	public void accelerate() {
		gearNow++;
	}
	public void slowDown() {
		gearNow--;
	}


}
