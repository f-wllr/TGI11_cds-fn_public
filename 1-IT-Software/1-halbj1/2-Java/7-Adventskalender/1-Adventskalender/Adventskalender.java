/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 16.12.2021
 * @author 
 */

public class Adventskalender {
  
  public static void main(String[] args) {
    for (int z = 0; z < 6; z++) {
      for (int s = 1; s < 5; s++) {
        System.out.print((z * 4 + s) + " ");
      } // end of for
      System.out.println();
    } // end of for
  } // end of main

} // end of class Adventskalender

