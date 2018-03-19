package PowerBall;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Hopper {
	List<PingPongBall> hoppaBalls = new ArrayList<>();
	

	public void shuffle() {
		Collections.shuffle(hoppaBalls);
		drawBall();
	}
	
	public void drawBall() {
		for (int i = 0; i < 4; i++) {
			PingPongBall db = hoppaBalls.remove(0);
			System.out.println(db.getLabel());
		}
	}
	
	public void addBalls(List<PingPongBall> setOfBalls){
		hoppaBalls.addAll(setOfBalls);
		shuffle();
		
	}
	
	
}


