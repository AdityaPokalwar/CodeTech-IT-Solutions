package com.myproject;

import java.lang.Math;
import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Lets play a game...");
		System.out.println("--Computer will generate a random number between 1 to 100 and "
				+ "you have to guess that number in 6 attempts--");
		double compGenertedNum = Math.random();
		int compNum = (int) (compGenertedNum * 100);
		
		System.out.println("-----Game Starts-----");
		System.out.println("Computer has generated a number now its your turn to guess it right..");
		int attempts = 6;

		while (true) {
			int number;
			System.out.println("Guess the number:");
			number = sc.nextInt();
			if (attempts == 1) {
				System.out.println("Oops! you losed the game.The number was "+compNum+".");
				break;
			} else if (compNum == number) {
				System.out.println("Whoaa!! you have guessed the right number..");
			} else if (compNum > number) {
				attempts--;
				System.out.println(number + " is low, try again in " + attempts + " attempts");

			} else if (compNum < number) {
				attempts--;
				System.out.println(number + " is high, try again in " + attempts + " attempts");

			}

		}
		sc.close();
	}

}
