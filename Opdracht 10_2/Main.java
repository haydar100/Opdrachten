import java.util.*;

public class Main {
	public static void main(String[] args){
		Persoon p1 = new Persoon("Eric",20000);
		Persoon p2 = new Persoon("Hans",60000);
		Persoon p3 = new Persoon("Willem-Alexander",8500000);

		Computer c1 = new Computer("Medion",2000,2006,"Super");
		Computer c2 = new Computer("Dell",1500,2007,"Home");

		if(p1.koop(c1)){
			System.out.println("Deze koper bezit nu nog "+p1.getBudget());
		}
		if(p1.koop(c1)){
			System.out.println("Deze koper bezit nu nog "+p1.getBudget());
		}
		if(p2.koop(c1)){
			System.out.println("Deze koper bezit nu nog "+p2.getBudget());
		}
		if(p2.koop(c2)){
			System.out.println("Deze koper bezit nu nog "+p2.getBudget());
		}
		if(p3.koop(new Computer("Dell",1500,2007, "Home"))){
			System.out.println("Deze koper bezit nu nog "+p3.getBudget());
		}
		if(p3.koop(c2)){
			System.out.println("Deze koper bezit nu nog "+p3.getBudget());
		}

		System.out.println("\n"+p1);
		System.out.println(p2);
		System.out.println(p3);

		if(p1.verkoop(c1,p3)){
			System.out.println("Deze verkoper bezit nu nog "+p1.getBudget());
		}
		if(p2.verkoop(c1,p3)){
			System.out.println("Deze verkoper bezit nu nog "+p2.getBudget());
		}
		if(p2.verkoop(c2,p1)){
			System.out.println("Deze verkoper bezit nu nog "+p2.getBudget());
		}
		System.out.println("\n"+p1);
		System.out.println(p2);
		System.out.println(p3);
	}
}