import java.util.Scanner;
import java.util.Arrays;

public class SortiererTester {
  
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String wahl;
    do{
        System.out.print("Was soll getestet werden, Bubblesort (B) oder Selection Sort (S)? ");
        wahl = scan.next().toUpperCase();
    } while (!wahl.equals("B") && !wahl.equals("S"));
    
    double [][] test = {   {3.6,6.2,2.4,1.6,4.1,5.8},
                           {6.0,5.0,4.0,3.0,2.0,1.0},
                           {3.0,7.0,3.0,7.0,3.0,7.0},
                           {3.3,7.3,3.4,7.4,3.5,7.5},
                           {4.1,4.2},
                           {200.2,777.7,324.3,101.1,94.9,132.3}
    } ;
    
    int korrekt = 0;    
    for (int i = 0; i < test.length; i++) {
      double [] out = Arrays.copyOf(test[i], test[i].length);
      Arrays.sort(out);
      
      if (wahl.startsWith("B")) {
        MeineArrayBib.bubblesort(test[i]);
      } else {
        MeineArrayBib.selectionsort(test[i]);        // Kommentar l�schen, wenn Selection Sort programmiert wurde
      } 
      if (Arrays.equals(test[i], out) ){
        System.out.println("Test " + i + " erfolgreich: " + Arrays.toString(test[i]) + " und " + Arrays.toString(out));
        korrekt++;
      } else {
        System.out.println("Test " + i + " nicht erfolgreich: " + Arrays.toString(test[i]) + " statt " + Arrays.toString(out));
      }
    }


  } // end of main

} // end of class SortiererTester

