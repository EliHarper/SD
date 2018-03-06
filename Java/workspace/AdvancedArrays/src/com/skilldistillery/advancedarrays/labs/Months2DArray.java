package com.skilldistillery.advancedarrays.labs;

public class Months2DArray {

	public static void main(String[] args) {
		String monthsArray[][] = 
			{
				{"January", "Jan", "31"},
				{"February", "Feb", "28"},
				{"March", "Mar", "31"},
				{"April", "Apr", "30"},
				{"May", "May", "31"},
				{"June", "Jun", "30"},
				{"July", "Jul", "31"},
				{"August", "Aug", "31"},
				{"September", "Sep", "30"},
				{"October", "Oct", "31"},
				{"November", "Nov", "30"},
				{"December", "Dec", "31"}
			};
		System.out.print(monthsArray[0][0] + ", ");
		System.out.println(monthsArray[0][2]);
		
		for (int row = 0; row < monthsArray.length; row++) {
			for (int col = 0; col < monthsArray[row].length; col++) {
				if (col == 2) {
					if (monthsArray[row][col].equals("31")) {
						System.out.println(monthsArray[row][0]);
					}
				}
			}
			
		}
	}
}
