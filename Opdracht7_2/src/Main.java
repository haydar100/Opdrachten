
public class Main {
  public static void main(String[] args) {
    Goed g1 = new Auto("Citroen", 25000, 2006, "26 GR NJ");
    Goed g2 = new Auto("Renault", 30000, 2007, "71 JH KD");
    Goed g3 = new Computer("Medion", 2000, 2006, "Super");
    Goed g4 = new Computer("Dell", 1500, 2007, "Home");
    Goed g5 = new Huis("Starters Woning", 210000.00, 1997,85);
    Goed g6 = new Huis("Villa", 975000.00, 2004, 315);

    System.out.println(g1);
    System.out.println(g2);
    System.out.println(g3);
    System.out.println(g4);
    System.out.println(g5);
    System.out.println(g6);
  }
}
