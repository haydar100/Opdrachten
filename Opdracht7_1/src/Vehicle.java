
public abstract class Vehicle {
	protected int gearNow;
	protected int maxGears;
	
		public Vehicle(int maxG) {
			maxGears = maxG;
			
		}
		 
		public int getGearNow() {
			return gearNow;
		}
			
		public String toString() {
			return "";

		}
		
		public abstract void accelerate();
		
		public abstract void slowDown();
		
		}
		
		

	
