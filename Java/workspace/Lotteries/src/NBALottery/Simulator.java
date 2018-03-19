package NBALottery;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Simulator {

	static String winningTeam;
	String[] teamWon = new String[100];
	
	public static void main(String[] args) {
		Simulator s = new Simulator();
		s.run();
	}
	
	private void run() {
		

	for (int i = 0; i < 100; i++) {
		NBALotteryApp app = new NBALotteryApp();
		teamWon[i] = winningTeam;
		
	}
	
	Set<String> winSet = new HashSet<>();
	Map<String, Integer> teamWins = new HashMap<>();
	
	
	
	for (int i = 0; i < teamWon.length; i++) {
		if (winSet.add(teamWon[i])) {
			teamWins.put(teamWon[i], 1);
		}
		else {
			
		}
	}
	
	
	System.out.println();
	}
	
	public static String getWinner(String winner) {
		winningTeam = winner;
		return winningTeam;
	}
}
