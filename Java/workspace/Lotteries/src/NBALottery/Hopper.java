package NBALottery;

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
		PingPongBall db = hoppaBalls.remove(0);
		Simulator.getWinner(db.getLabel());
	}
	
	public void addBalls(List<PingPongBall> setOfBalls){
		hoppaBalls.addAll(setOfBalls);
		shuffle();
		
	}
	
	
	
}


