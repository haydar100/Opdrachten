import java.util.*;
import java.text.*;

public class Persoon{
	private String naam;
	private double budget;
	private ArrayList<Computer> bezittingen;

	public Persoon(String nm, double bud){
		naam=nm;
		budget=bud;
		bezittingen = new ArrayList<Computer>();
	}
	public boolean bezit(String mrk){
		boolean b = false;
		for(Computer c : bezittingen){
			if(c.merk.equals(mrk)){
				b=true;
			}
		}
		return b;
	}
	public boolean koop(Computer c){
		if(bezit(c.merk)){
			System.out.println(naam+" heeft niet gekocht: "+c.merk);
			return false;
		}else{
			if(c.huidigeWaarde()<budget){
				budget-=c.huidigeWaarde();
				bezittingen.add(c);
				System.out.println(naam+" heeft gekocht: "+c.merk);
				return true;
			}else{
				System.out.println(naam+" heeft niet gekocht: "+c.merk);
				return false;
			}
		}
	}
	public boolean verkoop(Computer c, Persoon koper){
		boolean b=false;
		if(koper.bezit(c.merk)==false){
			if(c.huidigeWaarde()<koper.getBudget()){
				System.out.println(koper.naam+" heeft gekocht: "+c.merk);
				System.out.println("verkoper "+naam+" heeft verkocht "+c.merk+" aan koper "+koper.naam);
				koper.budget-=c.huidigeWaarde();
				budget+=c.huidigeWaarde();
				koper.bezittingen.add(c);
				bezittingen.remove(c);
				b=true;
			}
		}else{
			System.out.println(koper.naam+" heeft niet gekocht: "+c.merk);
			System.out.println("verkoper "+naam+" heeft niet verkocht "+c.merk);
		}
		return b;
	}

	public double getBudget(){
		return budget;
	}
	public String toString(){
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(2);
		String s=naam+" heeft budget: "+nf.format(budget)+" en de bezittingen:";
		for (Computer c: bezittingen){
			s+=c.toString();
		}
		s+="\n";
		return s;
	}
}