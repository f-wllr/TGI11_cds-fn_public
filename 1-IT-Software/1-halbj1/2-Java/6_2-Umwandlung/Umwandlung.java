/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.12.2021
 * @author 
 */
 
import java.util.Scanner;

public class Umwandlung {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    
    String binHex = " ";
    boolean bhTrue = false;
    do {
      System.out.print("Bitte entscheiden sie sich, ob sie in eine Binäre(b) oder Hexadezimale(h) Zahl umwandeln möchten: ");
      binHex = derScanner.next();
    } while (!(binHex.equals("b") || binHex.equals("h"))); // end of do-while
    
    int dez;
    do {
      System.out.print("Bitte geben sie eine Zahl zwischen 0 und 65535 ein: ");
      dez = derScanner.nextInt();
    } while (dez < 0 || dez > 65535); // end of do-while
    
    if (binHex.equals("b")) {
      String bin = " ";
    int rest = 0;
    while (dez > 0) {
      rest = dez % 2;
      bin = rest + bin;
      dez = (dez - rest) / 2;      
    } // end of while    
    System.out.println("Die Zahl ist: " + bin);
    }
    else if (binHex.equals("h")) {
       
     } // end of if
    
    
  } // end of main

} // end of class Umwandlung
