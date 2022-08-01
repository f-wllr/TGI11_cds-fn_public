import java.util.Scanner;

public class Zahlenraten {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    int zahl = Würfel.würfelnVonBis(1, 10000);
    
    boolean erraten = false;
    while (erraten == false) {
      System.out.print("Raten sie eine Zahl zwischen 1 und 100000: ");
      int geraten = derScanner.nextInt();
      if (geraten == zahl) {
        System.out.println("Richtig");
        erraten = true;
      } else if (geraten > zahl) {
          System.out.print("Leider Falsch: Zu groß: ");
          int daneben = geraten- zahl;
          if (daneben < 20) {
            System.out.println("Heiß");
          } else if (daneben < 100) {
              System.out.println("Warm");     
            } else {
              System.out.println("Kalt");     
            } // end of if-else
        } else if (geraten < zahl) {
            System.out.print("Leider Falsch: Zu klein: ");
            int daneben = zahl - geraten;
            if (daneben < 20) {
              System.out.println("Heiß");
            } else if (daneben < 100) {
                System.out.println("Warm");     
              } else {
                System.out.println("Kalt");     
              } // end of if-else  
          }// end of if-else
      
    } // end of while  
    
  } // end of main

} // end of class Zahlenraten

