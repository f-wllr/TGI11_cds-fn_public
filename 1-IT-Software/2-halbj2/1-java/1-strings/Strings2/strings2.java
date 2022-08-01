import java.util.Scanner;

public class strings2 {  
  public static void main(String[] args) {
    Scanner derScanner = new Scanner(System.in);

    boolean nameGueltig;
    boolean pinGueltig;
    boolean pwdGueltig;


    do {
      System.out.print("Bitte geb sie ihren zugewiesensenen Benutzernamen ein: ");
      String initialBenutzername = derScanner.next();
      nameGueltig = pruefeBenutzername(initialBenutzername);
    } while (nameGueltig == false); // end of do-while
    
    do {
      System.out.print("Bitte geb sie ihre Pin ein: ");
      String eingegebenePin = derScanner.next();
      pinGueltig = pruefePin(eingegebenePin);
    } while (pinGueltig == false); // end of do-while

    do {
      System.out.print("Biite geben sie sich ein neues Passwort: ");
      String pwd = derScanner.next();
      pwdGueltig = pruefePwd(pwd);
    } while (pwdGueltig == false);
  } // end of main



  
  static boolean pruefeBenutzername(String pName){
    if (pName.equals("aBcD")) {
      return true;
    } else {
      return false;
    } // end of if-else
    
  }
  
  static boolean pruefePin(String pPin){
    if (pPin.equals("1234")) {
      return true;
    } else {
      return false;
    } // end of if-else
  }

  static boolean pruefePwd(String pPwd){
    if(pPwd.contains("A") || pPwd.contains("B") || pPwd.contains("C") || pPwd.contains("D") || pPwd.contains("E") || pPwd.contains("F") || pPwd.contains("G") || pPwd.contains("H") || pPwd.contains("I") || pPwd.contains("J") || pPwd.contains("K") || pPwd.contains("L") || pPwd.contains("M") || pPwd.contains("N") || pPwd.contains("O") || pPwd.contains("P") || pPwd.contains("Q") || pPwd.contains("R") || pPwd.contains("S") || pPwd.contains("T") || pPwd.contains("U") || pPwd.contains("V") || pPwd.contains("W") || pPwd.contains("X") || pPwd.contains("Y") || pPwd.contains("Z") && 
       pPwd.contains("a") || pPwd.contains("b") || pPwd.contains("c") || pPwd.contains("d") || pPwd.contains("e") || pPwd.contains("f") || pPwd.contains("g") || pPwd.contains("h") || pPwd.contains("i") || pPwd.contains("j") || pPwd.contains("k") || pPwd.contains("l") || pPwd.contains("m") || pPwd.contains("n") || pPwd.contains("o") || pPwd.contains("p") || pPwd.contains("q") || pPwd.contains("r") || pPwd.contains("s") || pPwd.contains("t") || pPwd.contains("u") || pPwd.contains("v") || pPwd.contains("w") || pPwd.contains("x") || pPwd.contains("y") || pPwd.contains("z") && 
       pPwd.contains("1") || pPwd.contains("2") || pPwd.contains("3") || pPwd.contains("4") || pPwd.contains("5") || pPwd.contains("6") || pPwd.contains("7") || pPwd.contains("8") || pPwd.contains("9") || pPwd.contains("0") && 
       pPwd.lenght(5)){
      return true;
    }
    return false;
  }

} // end of class strings