package NBALottery;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {

	public List<PingPongBall> makeBall(String[] label, int[]numBallz) {
		
		List<PingPongBall> setOfBalls = new ArrayList<>();
		
			for (int i = 0; i < numBallz.length; i++) {
				for (int j = 0; j < numBallz[i]; j++) {
					PingPongBall ball = new PingPongBall();
					ball.label = label[i];
					setOfBalls.add(ball);
					
				}
			}
		
		
		return setOfBalls;
		
	}
	
//	public List<PingPongBall> makeBalls(String label, int numBall){
//		
//		List<PingPongBall> allBalls = new ArrayList<>();
//		
//		return null;
//		
//	}

}
