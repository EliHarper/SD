package ticTacToeGame;

import java.util.Scanner;

public class ticTacToeGame {
	public static String markAssign;
	public static int turn;
	public static int markCoord1;
	public static int markCoord2;
	public static char charP1Assign, charP2Assign;
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		char boardArray[][] = {
				{'*','*','*'},
				{'*','*','*'},
				{'*','*','*'},
		};
		
		turn =1;
		prompts(boardArray);
	}
	
	public static void prompts(char[][] boardArray){
		
		if (turn == 1) {
			System.out.println("Player 1: Select X or O");
			markAssign = kb.next();
			charP1Assign = (char) markAssign.charAt(0);
			turn ++;
		}
		
		if (turn ==2) {
			System.out.println("Player 1, where would you like your first mark to go?");
			markCoord1 = kb.nextInt();
			markCoord2 = kb.nextInt();
			boardArray[markCoord1][markCoord2] = charP1Assign; 
			displayBoard(boardArray);
		}
		
		if (charP1Assign == 'X') {
			charP2Assign = 'O';
		}
		
		else if (charP1Assign == 'O') {
			charP2Assign = 'X';
		}
		
		
	}

	public static void displayBoard(char boardArray[][]) {
		for (int row = 0; row < boardArray.length; row++) {
			for (int col = 0; col < boardArray[row].length; col++) {
				System.out.println(boardArray[0][col]);
			}
		}
	}
}
