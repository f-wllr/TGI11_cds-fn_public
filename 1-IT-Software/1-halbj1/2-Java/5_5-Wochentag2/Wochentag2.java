/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 02.12.2021
 * @author 
 */
 import java.util.Scanner;

public class Wochentag2 {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    
    System.out.println("Geben sie ein gültiges Datum ein");
    
    System.out.print("Tag (1-31): ");
    int tag=derScanner.nextInt();
    
    System.out.print("Monat (1-12): ");
    int monat=derScanner.nextInt();
    
    System.out.print("Jahr (vierstellig): ");
    int jahr=derScanner.nextInt();
    
    
    
    int berMonat=0; //Monat, der für die Berechnungen genutzt wird
    
    switch (monat) {
      case 1: 
        berMonat=0;
        break;
      case 2: 
        berMonat=3;
        break;
      case 3: 
        berMonat=2;
        break;
      case 4: 
        berMonat=5;
        break;
      case 5: 
        berMonat=0;
        break;
      case 6: 
        berMonat=3;
        break;
      case 7: 
        berMonat=5;
        break;
      case 8: 
        berMonat=1;
        break;
      case 9: 
        berMonat=4;
        break;
      case 10: 
        berMonat=6;
        break;
      case 11: 
        berMonat=2;
        break;
      case 12: 
        berMonat=4;
        break;
      default: 
        berMonat=100;
    } // end of switch
    
    
    
    int y = jahr%100;
    int c = jahr/100;
    
    if (berMonat == 11 || berMonat == 12) {
      y--;
    } // end of if
    
    if (berMonat == 11 || berMonat == 12) {
      c--;
    } // end of if
    
      
    
    int wochentag = (tag+berMonat+y+(y/4)+(c/4)-2*c)%7;
    
    System.out.println(wochentag);
    
    int deineMutter = 0;
    switch (deineMutter) {
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
        System.out.println("Das ist kein gültiger Wochentag");
         }
  } // end of main

} // end of class Wochentag2

