
public class Trein extends Vehicle {
	private boolean ATB_ok;
	
	
	public Trein(int maxG, boolean atb) {
		super(maxG);
		ATB_ok = atb;
	}
	
	
	public String toString() {
		return "Trein met huidige versnelling: "+gearNow+" en max: "+maxGears;
	}

	public void setATB_ok(boolean aTB_ok) {
		ATB_ok = aTB_ok;
	
	}
	
	public void accelerate() {
		if(getGearNow() < maxGears && ATB_ok == true) {
			gearNow++;
		}
		
	}
	public void slowDown() {
		if(getGearNow() > 0 && ATB_ok == true) {
			gearNow--;
		}
		if(!ATB_ok) {
			gearNow = 0;
		}
	}
	
	
	
}