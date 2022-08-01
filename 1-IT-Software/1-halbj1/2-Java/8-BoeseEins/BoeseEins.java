import java.util.Scanner;

public class BoeseEins {
  
  static Scanner derScanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    zeigeRegeln();
    
    int anDerReihe = 1;
    int punkteS1 = 0;
    int punkteS2 = 0;
    int punkteZug = 0;
    
    while (punkteS1 < 50 && punkteS2 < 50) { 
      int augen = Würfel.würfeln();
      
    } // end of while
    
  }
  
  static void zeigeRegeln(){
    System.out.println("**** So wird gespielt: ****");
    System.out.println("Die Spieler wechseln sich ab, Spieler 1 beginnt.");
    System.out.println("Jeder Spieler darf so lange würfeln, bis er eine 1 würfelt oder sich entschließt, den Spielzug zu beenden.");
    System.out.println("Würfelt er eine 1, so bekommt er für diesen Zug keine Punkte.");
    System.out.println("Entschließt er sich vorher, den Zug zu beenden, bekommt er die Summe der Augen gutgeschrieben.");
    System.out.println("Das Spiel endet, wenn einer der beiden Spieler mindestens 50 Punkte erreicht.");
    }
  
  static boolean frageRundeBeenden(){
    String antwort;
    do {
      System.out.print("Möchten Sie weiterspielen? J (Ja) oder N (Nein): ");
      antwort = derScanner.next();
    } while (!antwort.equals("J") && !antwort.equals("N")); // end of do-while
    
    if (antwort.equals("J")) {
      return true;
    } else {
      return false;
    } // end of if-else
    
    }
  
  static int berechnePunkte(int punkteAlt, int wurfNeu){
    if (wurfNeu == 1) {
      punkteAlt = 0;
    } else {
      punkteAlt = punkteAlt + wurfNeu;
    } // end of if-else
    return punkteAlt;  
    }
  
} // end of class BoeseEins
