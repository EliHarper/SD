package NBALottery;

import java.util.HashMap;
import java.util.Map;

public class NBA {
	
	private static Map<String, Integer> teamBallz;  
	
	
	public static Map<String, Integer> makeMap(){
		
		teamBallz = new HashMap<>();
		
		teamBallz.put("Panthers", 250);
		teamBallz.put("HandFaces", 199);
		teamBallz.put("BobCats", 156);
		teamBallz.put("TomCats", 119);
		teamBallz.put("SuperTurtles", 88);
		teamBallz.put("WarTurtles", 63);
		teamBallz.put("Cows", 43);
		teamBallz.put("Spongebobs", 28);
		teamBallz.put("Wolverines", 17);
		teamBallz.put("Sheep", 11);
		teamBallz.put("Clones", 8);
		teamBallz.put("Hawkeyes", 7);
		teamBallz.put("Spartans", 6);
		teamBallz.put("Cyclones", 5);
		
		
		
		
		
		return teamBallz;
		
	}


	public Map<String, Integer> getTeamBallz() {
		return teamBallz;
	}


	public void setTeamBallz(Map<String, Integer> teamBallz) {
		this.teamBallz = teamBallz;
	}
	
}
