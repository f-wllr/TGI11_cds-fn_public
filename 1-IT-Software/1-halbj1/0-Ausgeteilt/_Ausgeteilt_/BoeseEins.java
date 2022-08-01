import java.util.Scanner;

public class BoeseEins {
  
  static Scanner derScanner = new Scanner(System.in);
  
  public static void main(String[] args) {
    
    System.out.println("**** So wird gespielt: ****");
    System.out.println("Die Spieler wechseln sich ab, Spieler 1 beginnt.");
    System.out.println("Jeder Spieler darf so lange würfeln, bis er eine 1 würfelt oder sich entschließt, den Spielzug zu beenden.");
    System.out.println("Würfelt er eine 1, so bekommt er für diesen Zug keine Punkte.");
    System.out.println("Entschließt er sich vorher, den Zug zu beenden, bekommt er die Summe der Augen gutgeschrieben.");
    System.out.println("Das Spiel endet, wenn einer der beiden Spieler mindestens 50 Punkte erreicht.");
    
  }
  
  
} // end of class BoeseEins

