/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.12.2021
 * @author 
 */
import java.util.Scanner;

public class Wochentag {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    System.out.print("Geben sie einen Wochentag ein (Nur Zahlen von 1 bis 7): ");
    int wochentag=derScanner.nextInt();
    
    switch (wochentag) {
      case 1:
        System.out.println("Montag");      
        break;
      case 2: 
        System.out.println("Dienstag");
        break;
        case 3:
        System.out.println("Mittwoch");      
        break;
        case 4:
        System.out.println("Donnerstag");      
        break;
        case 5:
        System.out.println("Freitag");      
        break;
        case 6:
        System.out.println("Samstag");      
        break;
        case 7:
        System.out.println("Sonntag");      
        break;
      default: 
        System.out.println("Das ist kein g�ltiger Wochentag");
    } // end of switch
    
  } // end of main

} // end of class Wochentag

