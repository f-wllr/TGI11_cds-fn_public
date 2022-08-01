/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 09.12.2021
 * @author 
 */

import java.util.Scanner;

public class BinKonv {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    System.out.print("Bitte geben sie eine Zahl zwischen 0 und 65535 ein: ");
    int dez = derScanner.nextInt();
    String bin = " ";
    int rest = 0;
    while (dez > 0) {
      rest = dez % 2;
      bin = rest + bin;
      dez = (dez - rest) / 2;      
    } // end of while    
    System.out.println("Die Zahl ist: " + bin);
  } // end of main

} // end of class BinKonv

