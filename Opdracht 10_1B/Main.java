public class Main {
	public static void main(String[] args){
		Adresboek a=new Adresboek("Contacten");

		Contact c1=new Contact("Jan","Metdekorteachternaam","jan@lol.nl");
		Contact c2=new Contact("Kees","Hoogtevrees","keeshoogetevrees@hotmail.com");
		Contact c3=new Contact("Piet","Kierewiet","pietisdeman@msn.com");

		a.voegContactToe(c1);
		a.voegContactToe(c2);
		a.voegContactToe(c3);

		System.out.println(a);

		String mail = "jan@lol.nl";
		Contact con = a.zoekContact(mail);
		if(con!=null){
			System.out.println("Contactgegevens: "+con);
		}else{
			System.out.println(mail+" staat niet in het adresboek.");
		}

		a.verwijderContact(con);
		System.out.println("\nDit zijn de gegevens:");
		System.out.println(a);
		System.out.println("In dit adresboek staan "+a.aantalContacten()+" contacten.");
	}
}