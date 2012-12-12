public class Contact{
	protected String voornaam;
	protected String achternaam;
	protected String email;

	public Contact(String vrnm, String anm, String em){
		voornaam=vrnm;
		achternaam=anm;
		email=em;
	}
	public String getEmail(){
		return email;
	}
	public void setEmail(String em){
		email=em;
	}
	public String toString(){
		String s=voornaam+" "+achternaam+" heeft email-adres: "+email;
		return s;
	}
}