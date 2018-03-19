package NBALottery;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LotteryManager {
	
	void passBallData(Map<String, Integer> teamBallz) {
		Set<String> s = teamBallz.keySet();
		Iterator<String> it = s.iterator();
		
		int [] numBallsArr = new int[teamBallz.size()];
		String [] nameBallsArr = new String[teamBallz.size()];
		int count = 0;
		
		while(it.hasNext()) {
			String key = it.next();
			numBallsArr[count] = teamBallz.get(key);
			nameBallsArr[count] = key;
			count++; 
			
		//for (int i = 0; i < teamBallz.size(); i++) {
			
		}
		List<PingPongBall> setOfBalls;
		BallFactory bf = new BallFactory();
		setOfBalls = bf.makeBall(nameBallsArr, numBallsArr);
				
		Hopper hopper = new Hopper();
		hopper.addBalls(setOfBalls);
		
		
	}
	public void managerDuties() {
		
		
	}
	
}
