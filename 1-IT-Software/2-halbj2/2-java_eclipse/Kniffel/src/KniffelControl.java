import java.util.Arrays;

public class KniffelControl {
	static int anzSpieler1;
	static int anzSpieler2;
	
	public static int berechne1er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 1) {
				punkte = punkte + 1;
			}
		}
		return punkte;
	}

	public static int berechne2er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 2) {
				punkte = punkte + 2;
			}
		}
		return punkte;
	}

	public static int berechne3er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 3) {
				punkte = punkte + 3;
			}
		}
		return punkte;
	}

	public static int berechne4er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 4) {
				punkte = punkte + 4;
			}
		}
		return punkte;
	}

	public static int berechne5er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 5) {
				punkte = punkte + 5;
			}
		}
		return punkte;
	}

	public static int berechne6er(int[] augen) {
		int punkte = 0;
		for(int i = 0; i < 5; i++) {
			if(augen[i] == 6) {
				punkte = punkte + 6;
			}
		}
		return punkte;
	}

	public static int berechneDreierpasch(int[] augen) {
		int punkte = 0;
		int anzahl1 = 0;
		int anzahl2 = 0;
		int anzahl3 = 0;
		int anzahl4 = 0;
		int anzahl5 = 0;
		int anzahl6 = 0;
		for(int i=0;i<5;i++) {
			if(augen[i] == 1) {
				anzahl1 = anzahl1 + 1;
			}
			if(augen[i] == 2) {
				anzahl2 = anzahl2 + 1;
			}
			if(augen[i] == 3) {
				anzahl3 = anzahl3 + 1;
			}
			if(augen[i] == 4) {
				anzahl4 = anzahl4 + 1;
			}
			if(augen[i] == 5) {
				anzahl5 = anzahl5 + 1;
			}
			if(augen[i] == 6) {
				anzahl6 = anzahl6 + 1;
			}
		}
		if(anzahl1 >= 3 || anzahl2 >= 3 || anzahl3 >= 3 || anzahl4 >= 3 || anzahl5 >= 3 || anzahl6 >= 3) {
		for(int k=0;k<5;k++) {
			punkte=augen[k]+punkte;
		}
		}
		return punkte;
	}

	public static int berechneViererpasch(int[] augen) {
		int punkte = 0;
		int anzahl1 = 0;
		int anzahl2 = 0;
		int anzahl3 = 0;
		int anzahl4 = 0;
		int anzahl5 = 0;
		int anzahl6 = 0;
		for(int i=0;i<5;i++) {
			if(augen[i] == 1) {
				anzahl1 = anzahl1 + 1;
			}
			if(augen[i] == 2) {
				anzahl2 = anzahl2 + 1;
			}
			if(augen[i] == 3) {
				anzahl3 = anzahl3 + 1;
			}
			if(augen[i] == 4) {
				anzahl4 = anzahl4 + 1;
			}
			if(augen[i] == 5) {
				anzahl5 = anzahl5 + 1;
			}
			if(augen[i] == 6) {
				anzahl6 = anzahl6 + 1;
			}
		}
		if(anzahl1 >= 4 || anzahl2 >= 4 || anzahl3 >= 4 || anzahl4 >= 4 || anzahl5 >= 4 || anzahl6 >= 4) {
		for(int k=0;k<5;k++) {
			punkte=augen[k]+punkte;
		}
		}
		return punkte;
	}

	public static int berechneFullHouse(int[] augen) {
		int punkte = 0;
		Arrays.sort(augen);
		if((augen[0] == augen[1] && (augen[2] == augen[3] && augen[2] == augen[4]) || (augen[0] == augen[1] && (augen[0] == augen[2] && augen[3] == augen[4])))) {
			punkte+=25;
		}
		return punkte;
	}

	public static int berechneKlStrasse(int[] augen) {
		int punkte = 0;
		Arrays.sort(augen);
		for(int i = 0; i<augen.length-3; i++) {
			if(augen[i] == augen[i+1]-1 || augen[i+1] == augen[i+1] && augen[i] == augen[i+2]-2 && augen[i] == augen[i+3]-3) {
				punkte=punkte+30;
				return punkte;
			}
			if(augen[i] == augen[i+1]-1 && augen[i] == augen[i+2]-2 || augen[i+2] == augen[i+2] && augen[i] == augen[i+3]-3) {
				punkte=punkte+30;
				return punkte;
			}
			if(augen[i] == augen[i+1]-1 && augen[i] == augen[i+2]-2 && augen[i+3] == augen[i+3] || augen[i] == augen[i+3]-3) {
				punkte=punkte+30;
				return punkte;
			}
		}
		return punkte;
	}

	public static int berechneGrStrasse(int[] augen) {
		int punkte = 0;
		Arrays.sort(augen);
		for(int i = 0; i < augen.length - 4; i++) {
			if((augen[i] == (augen[i+1] - 1)) && ( augen[i] == (augen[i+2] - 2)) && (augen[i] == (augen[i+3] - 3)) && (augen[i] == (augen[i+3] - 3))) {
				punkte+=40;
			}
		}
		return punkte;
	}

	public static int berechneKniffel(int[] augen) {
		int punkte = 0;
		Arrays.sort(augen);
		if(augen[0] == augen[4]) {
			punkte = punkte+50;
		}
		return punkte;
	}

	public static int berechneChance(int[] augen) {
		return (augen[0]+augen[1]+augen[2]+augen[3]+augen[4]);
	}
	
	
	
	
	public static int berechneGesamtpunkte(int pSpieler, int pPunkte) {
		int[] spieler1 = new int[13];
		int[] spieler2 = new int[13];
		int gesPunkte = 0;
		
		if(pSpieler == 0) {
			spieler1[anzSpieler1] = pPunkte;
			anzSpieler1++;
			
			gesPunkte = (spieler1[0] + spieler1[1] + spieler1[2] + spieler1[3] + spieler1[4] + spieler1[5] + spieler1[6] + spieler1[7] + spieler1[8] + spieler1[9] + spieler1[10] + spieler1[11] + spieler1[12]);
		}else if(pSpieler == 1) {
			spieler2[anzSpieler2] = pPunkte;
			anzSpieler2++;
			
			gesPunkte = (spieler2[0] + spieler2[1] + spieler2[2] + spieler2[3] + spieler2[4] + spieler2[5] + spieler2[6] + spieler2[7] + spieler2[8] + spieler2[9] + spieler2[10] + spieler2[11] + spieler2[12]);
		}
		return gesPunkte;
	}

	public static void wuerfelnAlle(int[] augen, boolean[] behalten) {
		for(int i = 0; i < 5; i++) {
			if(behalten[i] == false) {
				augen[i] = Wuerfel.würfeln();
			}
		}
	}

}
