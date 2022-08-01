/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 20.01.2022
 * @author 
 */
 import java.util.Scanner;
public class mnf {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    
    System.out.print("Bitte geben sie a an: ");
    double a = derScanner.nextDouble();
    
    System.out.print("Bitte geben sie b an: ");
    double b = derScanner.nextDouble();
    
    System.out.print("Bitte geben sie c an: ");
    double c = derScanner.nextDouble();
    
    double erg1 = ((-1*b)+Math.sqrt((b*b)-4*a*c))/(2*a);
    double erg2 = ((-1*b)-Math.sqrt((b*b)-4*a*c))/(2*a);
    
    System.out.println("Die Nullstellen sind: " + erg1 + " und " + erg2);
    
    
    
  } // end of main

} // end of class mnf

