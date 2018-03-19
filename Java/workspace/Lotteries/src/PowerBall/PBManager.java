package PowerBall;

import java.util.List;

public class PBManager {

	void getAndLoad() {
		
		BallFactory bf = new BallFactory();
		List<PingPongBall> setOfBalls = bf.makeBall();
		List<PingPongBall> setOfPowerBalls = bf.makePowerBall();
		
		Hopper hopper = new Hopper();
		powerballHopper pbh = new powerballHopper();
		
		hopper.addBalls(setOfBalls);
		
		pbh.addBalls(setOfPowerBalls);
		
	}
}
