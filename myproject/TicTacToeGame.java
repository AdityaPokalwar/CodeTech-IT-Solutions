package com.myproject;

import java.util.Scanner;

public class TicTacToeGame {
	public static void main(String args[]) {
		char board[][] = new char[3][3];

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < 3; col++) {
				board[row][col] = ' ';
			}
		}
		char player = 'X';
		boolean gameOver = false;
		Scanner sc = new Scanner(System.in);
		while (!gameOver) {
			displayBoard(board);
			System.out.println("Type Co-ordinates for the Game(eg.0 1,1 2,2 2)");
			System.out.println("enter " + player + "  player :");
			int row = sc.nextInt();
			int col = sc.nextInt();
			if (board[row][col] == ' ') {
				board[row][col] = player;

				if (gameOver = winner(board, player)) {
					System.out.println(player + " has won.");
				} else if (gameOver = checkTie(board)) {
					System.out.println("Game has tied.");
				}

				else {
					// a simple ternary operator to switch if player is 'X' then switch to 'O' after
					// one step
					player = (player == 'X') ? 'O' : 'X';
				}

			} else {
				System.out.println("Invalid move! try again.");
			}

		}
		displayBoard(board);

	}

	private static boolean winner(char[][] board, char player) {
		// for horizontal wins
		for (int row = 0; row < board.length; row++) {
			if (board[row][0] == board[row][1] && board[row][1] == board[row][2] && board[row][0] != ' ') {
				return true;
			}
		}

		// Check for vertical wins
		for (int col = 0; col < board.length; col++) {
			if (board[0][col] == board[1][col] && board[1][col] == board[2][col] && board[0][col] != ' ') {
				return true;
			}
		}

		// Check for diagonal wins
		if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != ' ') {
			return true;
		}
		if (board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != ' ') {
			return true;
		}
		return false;
	}

	// check for tie
	private static boolean checkTie(char[][] board) {
		for (int row = 0; row < 3; row++) {
			for (int column = 0; column < 3; column++) {
				if (board[row][column] == ' ') {
					return false; // If there is still an empty cell
				}
			}
		}
		return true; // If all cells are filled
	}

	// display board after each step
	private static void displayBoard(char[][] board) {
		// to display the co-ordinates
		for (int i = 0; i < 3; i++) {
			System.out.print(i + "      ");
		}
		// rows
		for (int row = 0; row < 3; row++) {

			System.out.println();
			System.out.println("-----------------");

			// columns
			for (int col = 0; col < 3; col++) {

				System.out.print("  " + board[row][col] + " | ");

			}
			// just to display the co-ordinates
			System.out.print(row);

		}
		System.out.println();
		System.out.println("-----------------");

	}

}
