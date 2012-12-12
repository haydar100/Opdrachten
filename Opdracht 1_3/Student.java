public class Student
{
  private String naam;
  private int studentNummer;

  public Student ( String nm )
  {
   naam = nm;
  }

  public Student ( String nm , int sn)
  {
	  naam = (nm);
	  studentNummer = sn;
  }

  public String getNaam( )
  {
   return naam;
  }

  public String toString( )
  {
    String s = "Deze student heet " + naam + " en studentnummer is: " + studentNummer;
    return s;
  }
  public int getStudentNummer( )
  {
  return studentNummer;
  }

  public void setStudentNummer(int nwsn)
  {
	  studentNummer = nwsn;
 }
}







