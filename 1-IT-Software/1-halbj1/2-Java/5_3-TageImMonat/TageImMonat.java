/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.12.2021
 * @author 
 */
 import java.util.Scanner;

public class TageImMonat {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    System.out.print("Geben sie einen Monat ein (Nur Zahlen von 1 bis 12): ");
    int monat=derScanner.nextInt();
    
    switch (monat) {
      case 1: case 3: case 5: case 7: case 8: case 10: case 12:
        System.out.println("Dieser Monat hat 31 Tage");      
        break;
      case 2: 
        System.out.println("Dieser Monat hat 28 Tage");
        break;
        case 4: case 6: case 9: case 11: 
        System.out.println("Dieser Monat hat 30 Tage");      
        break;
      default: 
        System.out.println("Das ist kein gültiger Monat");
    } // end of switch
    
  
  } // end of main

} // end of class TageImMonat

