import java.util.*;

public class Adresboek{
	private String naam;
	private ArrayList<Contact> alleContacten;

	public Adresboek(String nm){
		naam=nm;
		alleContacten=new ArrayList<Contact>();
	}
	public void voegContactToe(Contact nwC){
		alleContacten.add(nwC);
	}
	
	public boolean heeftContact(String em){
		boolean b = false;
		for(Contact c : alleContacten){
			if(c.email.equals(em)){
				b =true;
			}
		}
		return b;
	}
	public Contact zoekContact(String em){
		Contact con=null;
		for(Contact c:alleContacten){
			if(c.email.equals(em)){
				con=c;
			}else if(c.voornaam.equals(em)){
				con=c;
			}else if(c.achternaam.equals(em)){
				con=c;
			}
		}
		return con;

	}
	public void verwijderContact(Contact exC){
		alleContacten.remove(exC);
	}
	public int aantalContacten(){
		return alleContacten.size();
	}
	public String toString(){
		String s="Het aantal contacten is: "+aantalContacten()+"\nDeze contacten zijn:\n";
		for (Contact c:alleContacten){
			s+=c.toString()+"\n";
		}
		return s;
	}
}

// hoi loekino


