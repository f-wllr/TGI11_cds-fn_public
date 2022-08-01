import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MeinListener implements ActionListener {

	// normale Attribute
	private int [] dieZahlen = {2,3,2,4,1,3,5,1,2,3};
	private int dran = 0;
	
	
	// Referenzattribute
	private ReaktionGUI dieGUI;
	private Spieldaten dieDaten;
	
	public MeinListener() {
	}
	
	// TODO Schritt 2a: Setter für das Referenzattribut dieGUI erstellen 1
	
	public void setzeGUIReferenz (ReaktionGUI pGUI) {
		dieGUI = pGUI;
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		// TODO Schritt 3: Aktionen für "Spiel starten" in den if-Zweig 1
		// Dabei 1==1 durch die echte Bedingung ersetzen! 1
		if (cmd.equals("Start")) {			
			dieDaten = new Spieldaten();
		    dieDaten.erfasseStartzeit(); // Aufruf der Methode erfasseStartzeit
		    dieGUI.zeigeZahl(dieZahlen[0]); // Zahl anzeigen lassen
		    dieGUI.setzeButtons(true); // Buttons (de-)aktivieren
			
		} else {
			
			int intCmd = Integer.parseInt(cmd);
			if (intCmd == dieZahlen[dran]) {
				   dran++; // erste Anweisung aus Schritt 4a 1
				   if (dran < 10) {
				       // bisheriger Code für "richtige Zahl" 1
					   dran++;
						dieGUI.zeigeZahl(dieZahlen[dran]);
						int fehler = dieDaten.gibFehlerzahl();
						int punkte = dieDaten.gibPunkte();
						dieGUI.zeigeStatus(dran + " Zahlen absolviert; bisher " + fehler + " Fehler. " + punkte + " Punkte.");
				   } else {
				       // neuer Code für "alle Zahlen angeklickt"
					   dieDaten.erfasseEndzeit();
					   int punkte = dieDaten.gibPunkte();
					   int fehler = dieDaten.gibFehlerzahl();
					   dieGUI.zeigeStatus("Spielende! " + punkte + " Punkte wurden erreicht, es wurden " + fehler + " Fehler gemacht.");
					   dieGUI.setzeButtons(false);
				  }
				}
			/*
			   if (intCmd == dieZahlen[dran]) {
				 TODO Schritt 4a: Code für korrekte Zahl schreiben 1
				
				dran++;
				dieGUI.zeigeZahl(dieZahlen[dran]);
				int fehler = dieDaten.gibFehlerzahl();
				int punkte = dieDaten.gibPunkte();
				dieGUI.zeigeStatus(dran + " Zahlen absolviert; bisher " + fehler + " Fehler. " + punkte + " Punkte.");
			
			} else {
				// TODO Schritt 4b: Code für falsche Zahl schreiben 1
				
				dieDaten.erhoheFehlerzahl();
				int fehler = dieDaten.gibFehlerzahl();
				dieGUI.zeigeStatus(dran + " Zahlen absolviert; bisher " + fehler + " Fehler.");
			}*/
		}

	}

}
