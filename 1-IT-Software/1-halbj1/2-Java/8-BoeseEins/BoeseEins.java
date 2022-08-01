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
      int augen = W�rfel.w�rfeln();
      
    } // end of while
    
  }
  
  static void zeigeRegeln(){
    System.out.println("**** So wird gespielt: ****");
    System.out.println("Die Spieler wechseln sich ab, Spieler 1 beginnt.");
    System.out.println("Jeder Spieler darf so lange w�rfeln, bis er eine 1 w�rfelt oder sich entschlie�t, den Spielzug zu beenden.");
    System.out.println("W�rfelt er eine 1, so bekommt er f�r diesen Zug keine Punkte.");
    System.out.println("Entschlie�t er sich vorher, den Zug zu beenden, bekommt er die Summe der Augen gutgeschrieben.");
    System.out.println("Das Spiel endet, wenn einer der beiden Spieler mindestens 50 Punkte erreicht.");
    }
  
  static boolean frageRundeBeenden(){
    String antwort;
    do {
      System.out.print("M�chten Sie weiterspielen? J (Ja) oder N (Nein): ");
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
