package com.skilldistillery.advancedarrays.drills;

public class MultiDeclare {
  public static void main(String[] args) {
    // Declare a two-dimensional array of char values to represent a 
    // tic-tac-toe board.
    char ticTacToe[][] = new char [3][3];
    
    ticTacToe [0][0] = 'X';
    ticTacToe [1][1] = 'X';
    ticTacToe[2][2] = 'X';
    // Assign the value 'X' to the top-left, middle, and bottom-right squares.
    // X  
    //  X 
    //   X
    ticTacToe [1][0] = 'O';
    ticTacToe [2][0] = 'O';
    ticTacToe [2][1] = 'O';
    // Assign the value 'O' (capital 'o') to the three squares bottom-left.
    // X  
    // OX 
    // OOX
    ticTacToe [0][1] = '*';
    ticTacToe [0][2] = '*';
    ticTacToe [1][2] = '*';
    // Assign the value '*' to the remaining squares.
    // X**  
    // OX*
    // OOX
    
    printBoard(ticTacToe);
    
    
  }
  public static void printBoard(char ticTacToe[][]){
	  for(int row=0; row < ticTacToe.length; row++) {
	      for(int col=0; col < ticTacToe[row].length; col++) {
	        System.out.print(ticTacToe[row][col]);
	      }
	      System.out.println();
	    }
  }
    		
}
