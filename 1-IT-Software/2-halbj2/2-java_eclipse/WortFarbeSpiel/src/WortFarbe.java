import java.util.Random;

public class WortFarbe {
	
	private int farbe;
	private  long timeStart;
	private long timeEnd;
	
	Random zufall = new Random();
	
	public int getFarbe() {
		
		farbe = zufall.nextInt(5);
		
		return farbe;
	}
	
	public void setStartTime() {
		timeStart = System.currentTimeMillis();
	}
	
	public void setEndTime() {
		timeEnd = System.currentTimeMillis();
	}
	
	public long getDuration() {
		long duration = (timeEnd - timeStart) / 1000;
		return duration;
	}
	
	public long getCurrentTime() {
		return System.currentTimeMillis();
	}
}
