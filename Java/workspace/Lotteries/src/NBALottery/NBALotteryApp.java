package NBALottery;

import java.util.HashMap;
import java.util.Map;

public class NBALotteryApp {
	
	
	public static void main(String[] args) {
		NBALotteryApp app = new NBALotteryApp();
		app.run();
	}
	
	public void run() {
		
		LotteryManager lm = new LotteryManager();
		
		NBA nba = new NBA();
		// below is code for the list of teams and the # of balls they get 
		Map<String, Integer> teamBallz = NBA.makeMap();
		lm.passBallData(teamBallz);
		
		
	}

}
