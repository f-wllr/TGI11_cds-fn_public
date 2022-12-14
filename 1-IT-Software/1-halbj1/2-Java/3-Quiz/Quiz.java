/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 18.11.2021
 * @author 
 */

 import java.util.Scanner;

public class Quiz {
  
  public static void main(String[] args) {
    int richtig = 0;
    
    Scanner derScanner = new Scanner(System.in);
    System.out.print("Bitte gib deinen Namen ein: ");
    String name = derScanner.next();
    if (name.equals("Lukas")) {
      name = "Lappen";
    } // end of if 
    System.out.println("Hallo " + name);
    System.out.println();
    System.out.println();
    
    //erste Frage
    System.out.print("In welchem Jahr wurde Deutschland zum letzten mal Fußballweltmeister? ");
    int jahr = derScanner.nextInt();
    if (jahr == 2014) {
      if (name.equals("Lappen")) {
        System.out.println("Das ist leider falsch.");
      } else {
        System.out.println("Das ist richtig.");
      } // end of if-else
      richtig++;
    } else {
      System.out.println("Das ist leider falsch.");
    } // end of if-else  
    System.out.println();
    
    //zweite Frage
    System.out.print("Wie lautet die Zahl Pi (4 Nachkommastellen)? (Bitte , benutzen: 1,5) ");
    double pi = derScanner.nextDouble();
    if (pi == 3.1415) {
      if (name.equals("Lappen")) {
        System.out.println("Das ist leider falsch.");
      } else {
        System.out.println("Das ist richtig.");
      } // end of if-else
      richtig++;
    } else {
      System.out.println("Das ist leider falsch.");
    } // end of if-else 
    System.out.println();
    
    //dritte Frage
    System.out.print("Ist das Büro von Herrn Kling in Raum N1.24? (Bitte nur mit true oder false antworten) ");
    boolean wahrheit = derScanner.nextBoolean();
    if (wahrheit == false) {
      if (name.equals("Lappen")) {
        System.out.println("Das ist leider falsch.");
      } else {
        System.out.println("Das ist richtig.");
      } // end of if-else
      richtig++;
    } else {
      System.out.println("Das ist leider falsch.");
    } // end of if-else 
    System.out.println();
    
    //vierte Frage
    System.out.print("Wie heißt die zweitgrößte Stadt im Bodenseekreis? ");
    String stadt = derScanner.next();
    if (stadt.equals("Überlingen")) {
      if (name.equals("Lappen")) {
        System.out.println("Das ist leider falsch.");
      } else {
        System.out.println("Das ist richtig.");
      } // end of if-else
      richtig++;
    } else {
      System.out.println("Das ist leider falsch.");
    } // end of if-else 
    System.out.println();
    
    //fünfte Frage
    System.out.print("Wie lautet der Titel des ersten Bandes der Harry-Potter-Reihe? ");
    derScanner.nextLine();
    String nameHarryPotterBandEins = derScanner.nextLine();
    if (nameHarryPotterBandEins.equals("Harry Potter und der Stein der Weisen")) {
      if (name.equals("Lappen")) {
        System.out.println("Das ist leider falsch.");
      } else {
        System.out.println("Das ist richtig.");
      } // end of if-else
      richtig++;
    } else {
      System.out.println("Das ist leider falsch.");
    } // end of if-else 
    System.out.println();
    System.out.println();
    
    System.out.println(name+", Du hast "+richtig+" Fragen richtig beantwortet.");
  } // end of main

} // end of class Quiz

