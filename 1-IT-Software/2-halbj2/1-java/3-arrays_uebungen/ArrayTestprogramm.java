import java.util.Arrays;
import java.util.Scanner;

public class ArrayTestprogramm {
  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);
    int [][] test = { {505370, 643801,  357022,  450295, 338145, 312685},
                         { 238391, 92090, 131957, 110879, 93028, 301340},
                         { 78867, 70273, 83871, 65300, 56594, 64589}};  
    int [] mins = {312685, 92090, 56594};
    int [] maxs = {643801, 301340, 83871};
    int [] minpos = {5, 1, 4};
    int [] maxpos = {1, 5, 2};
    
    int [][] suche = {{505379, 357029, 338145, 312685},
                         {238391, 92090, 110879, 301345},
                         {78867, 83871, 65309, 56594}};
    int [][] suchpos = {{-1, -1, 4, 5},
                         {0, 1, 3, -1},
                         {0, 2, -1, 4}};
    
    
    //Aufgabe 2: Min
      int richtig = 0;
      for (int i=0; i<3; i++) {
        int min = MeineArrayBib.gibMinimum(test[i]);
        if (min == mins[i]) {
          System.out.println("Richtig: Min = " + min + " im Array " + Arrays.toString(test[i]));
          richtig++;
        } else {
          System.out.println("Falsch: Array " + Arrays.toString(test[i]) + "ist: " + mins[i] + ", gefunden: " + min);
        }
      } // end of for  
      System.out.println("Suche nach Minimum: " + richtig + " von 3 richtig.\n");
      
    //Aufgabe 2: Max 
      richtig = 0;
      for (int i=0; i<3; i++) {
        double max = MeineArrayBib.gibMaximum(test[i]);
        if (max == maxs[i]) {
          System.out.println("Richtig: Max = " + max + " im Array " + Arrays.toString(test[i]));
          richtig++;
        } else {
          System.out.println("Falsch: Array " + Arrays.toString(test[i]) + "ist: " + maxs[i] + ", gefunden: " + max);
        }
      } // end of for  
      System.out.println("Suche nach Maximum: " + richtig + " von 3 richtig.\n");
    
    //Aufabe 3: Position Min
    int richtigPos = 0;
      for (int i=0; i<3; i++) {
        int mp = MeineArrayBib.gibMinPos(test[i]);
        if (mp == minpos[i]) {
          System.out.println("Richtig: Minpos = " + mp + " im Array " + Arrays.toString(test[i]));
          richtigPos++;
        } else {
          System.out.println("Falsch: Array " + Arrays.toString(test[i]) + "ist: " + minpos[i] + ", gefunden: " + mp);
        }
      } // end of for  
      System.out.println("Suche nach Minpos: " + richtigPos + " von 3 richtig.\n");
      
    //Aufabe 3: Position Max  
      richtigPos = 0;
      for (int i=0; i<3; i++) {
        int mp = MeineArrayBib.gibMaxPos(test[i]);
        if (mp == maxpos[i]) {
          System.out.println("Richtig: Maxpos = " + mp + " im Array " + Arrays.toString(test[i]));
          richtigPos++;
        } else {
          System.out.println("Falsch: Array " + Arrays.toString(test[i]) + "ist: " + maxpos[i] + ", gefunden: " + mp);
        }
      } // end of for  
      System.out.println("Suche nach Maxpos: " + richtigPos + " von 3 richtig.\n");
    
    //Aufgabe 4: Werte suchen und Pos zurück geben
    int richtigGes = 0;
      for (int i=0; i<3; i++) {
        for (int j=0; j<4; j++) {
          int fundstelle = MeineArrayBib.suche(suche[i][j], test[i]);
          if (fundstelle == suchpos[i][j]) {
            System.out.println("Richtig: Wert " + suche[i][j] + " an Stelle " + fundstelle + " im Array " + Arrays.toString(test[i]));
            richtigGes++;
          } else {
            System.out.println("Falsch: Wert " + suche[i][j] + " nicht an Stelle " + fundstelle + ", sondern an " + suchpos[i][j] + " im Array " + Arrays.toString(test[i]));
          }
        } // end of for
      } // end of for
      System.out.println("Suche nach Werten: " + richtigGes + " von 12 richtig.\n");

      System.out.print(minpos[0]);
      System.out.print(minpos[1]);
      System.out.println(minpos[2]);

      MeineArrayBib.tausche(minpos, 1, 0);
  }
} 
  



