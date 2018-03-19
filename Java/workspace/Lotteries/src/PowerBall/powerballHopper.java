package PowerBall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class powerballHopper {
	
	List<PingPongBall> hoppaBalls = new ArrayList<>();
	

	public void shuffle() {
		Collections.shuffle(hoppaBalls);
		drawBall();
	}
	
	public void drawBall() {
		
		PingPongBall db = hoppaBalls.get(0);
		
		System.out.println(db.getLabel());
	}
	
	public void addBalls(List<PingPongBall> setOfBalls){
		hoppaBalls.addAll(setOfBalls);
		shuffle();
		
	}
	
	
	
}

