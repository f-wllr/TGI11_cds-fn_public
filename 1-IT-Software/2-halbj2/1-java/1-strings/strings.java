/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 07.02.2022
 * @author 
 */

import java.util.Scanner;

public class strings {  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    boolean nameG?ltig;
    boolean pinG?ltig;
    do {
      System.out.print("Bitte geb sie ihren zugewiesensenen Benutzernamen ein: ");
      String initialBenutzername = derScanner.next();
      nameG?ltig = pr?feBenutzername(initialBenutzername);
    } while (nameG?ltig == false); // end of do-while
    
    do {
      System.out.print("Bitte geb sie ihre Pin ein: ");
      String eingegebenePin = derScanner.next();
      pinG?ltig = pr?fePin(eingegebenePin);
    } while (pinG?ltig == false); // end of do-while
  } // end of main
  
  static boolean pr?feBenutzername(String pName){
    if (pName.equals("aBcD")) {
      return true;
    } else {
      return false;
    } // end of if-else
    
  }
  
  static boolean pr?fePin(String pPin){
    if (pPin.equals("1234")) {
      return true;
    } else {
      return false;
    } // end of if-else
    
    }
  
  static boolean passwordG?ltig(pPassword){
        
  
  }
      

} // end of class strings

