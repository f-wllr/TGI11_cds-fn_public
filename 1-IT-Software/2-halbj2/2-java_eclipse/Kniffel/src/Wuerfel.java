import java.util.Random;

public class Wuerfel{
  static Random rnd = new Random();
  
  public static int w�rfeln(){
    int zahl = rnd.nextInt(6)+1;  
    return zahl;
  }
  
  public static int w�rfelnVonBis(int von, int bis){
    int zahl = rnd.nextInt(bis-von+1)+von;  
    return zahl;
  }

}

