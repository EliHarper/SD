package com.skilldistillery.advancedarrays.labs;

public class SBScores {

	public static void main(String[] args) {
		String superBowlTeams[][] = 
				{
						{"Green Bay", "Kansas City"},
						{"Green Bay", "Oakland"},
						{"New York Jets", "Baltimore"}						
				};
		
		int superBowlScores[][] = 
			{
				{35, 10},
				{33, 14}, 
				{16, 7}
			};
		
		for (int row = 0; row < superBowlScores.length; row++) {
			for (int col = 0; col < superBowlScores[row].length; col++) {
				System.out.print(superBowlTeams[row][col] + ": ");
				System.out.print(superBowlScores[row][col]);
				if (col !=1) {
					System.out.print(" - ");
				}
				//or if col != 1
			}
			System.out.println();
		}
		
	}
}
