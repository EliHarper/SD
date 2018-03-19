package PowerBall;

import java.util.ArrayList;
import java.util.List;

public class BallFactory {
	
	private List<PingPongBall> setOfPowerBalls;
	private List<PingPongBall> setOfBalls;


	List<PingPongBall> makeBall() {
		
		setOfBalls = new ArrayList<>();
		
			for (int i = 0; i < 100; i++) {
					PingPongBall ball = new PingPongBall();
					ball.label = i;
					setOfBalls.add(ball);
			}
		
		return setOfBalls;
		
	}
	
	List<PingPongBall> makePowerBall() {
		
		setOfPowerBalls = new ArrayList<>();
		
		for (int i = 1; i < 11; i++) {
			PingPongBall ball = new PingPongBall();
			ball.label = i;
			setOfPowerBalls.add(ball);
			
		}
		
		return setOfPowerBalls;
		
	}
	
	public List<PingPongBall> getSetOfPowerBalls() {
		return setOfPowerBalls;
	}
	
	public void setSetOfPowerBalls(List<PingPongBall> setOfPowerBalls) {
		this.setOfPowerBalls = setOfPowerBalls;
	}
	
	public List<PingPongBall> getSetOfBalls() {
		return setOfBalls;
	}
	
	public void setSetOfBalls(List<PingPongBall> setOfBalls) {
		this.setOfBalls = setOfBalls;
	}
	
//	public List<PingPongBall> makeBalls(String label, int numBall){
//		
//		List<PingPongBall> allBalls = new ArrayList<>();
//		
//		return null;
//		
//	}

}
