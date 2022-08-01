
public class Spieldaten {
	private long startzeit;
	private long endzeit;
	private int fehlerzahl;
	private int punkte;
	
	public void erfasseStartzeit() {
		startzeit = System.currentTimeMillis();
	}
	
	public void erfasseEndzeit() {
		endzeit = System.currentTimeMillis();
	}
	
	public void erhoheFehlerzahl() {
		fehlerzahl ++;
	}
	
	public int gibPunkte() {
		if(endzeit != 0) {
			long durationS = endzeit/1000 - startzeit/1000;
			punkte = (int) (durationS + (5 * fehlerzahl));
			return punkte;
		}else {
			return 0;
		}
		
	}
	
	public int gibFehlerzahl() {
		return fehlerzahl;
	}
}
