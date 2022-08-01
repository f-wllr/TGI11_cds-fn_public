/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.12.2021
 * @author 
 */
 
import java.util.Scanner;

public class Geschenkboxen {
  
  public static void main(String[] args) {
    
    Scanner derScanner = new Scanner(System.in);
    int z = 0;
    int s = 0;
    
    do {
      System.out.print("Wie hoch soll das Geschenk sein? ");
      z = derScanner.nextInt();
    } while (z < 0); // end of do-while
    
    do {
      System.out.print("Wie breit soll das Geschenk sein? ");
      s = derScanner.nextInt();
    } while (s < 0); // end of do-while
    
    int posVBand = z / 2;
    int posHBand = s / 2;
    
    for (int zfor = 0; zfor < z; zfor++) {
      for (int sfor = 0; sfor < s; sfor++) {
        if (sfor == posHBand) {
          System.out.print("++");
        }
        if (zfor == posVBand) { // end of if{
          for (int j = 0; j < 2; j++) { 
            for (int i = 0; i < z; i++) {
            System.out.print("+");
            }
          } // end of for 
          System.out.println();       
        }else{
          System.out.print("#"); 
         } 
        } // end of if
      System.out.println();
      } 
    } // end of for
  } // end of main
