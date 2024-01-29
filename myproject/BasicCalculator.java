package com.myproject;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String args[]) {
		// Declaration of variables
		float num1;
		float num2;
		float result;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Choose which operation to be performed..");
			System.out.println("1.Addition");
			System.out.println("2.Substraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			int choice = sc.nextInt();

			if (choice == 5) {
				System.out.println("Thank you!");
				break;
			}
			if (choice >= 1) {
				switch (choice) {
				case 1:
					System.out.println("Addition");
					System.out.print("Enter number 1:");
					num1 = sc.nextFloat();
					System.out.print("Enter number 2:");
					num2 = sc.nextFloat();
					result = num1 + num2;
					System.out.println("Addition of " + num1 + " + " + num2 + " is " + result);
					System.out.println();
					break;
				case 2:
					System.out.println("Substraction");
					System.out.print("Enter number 1:");
					num1 = sc.nextFloat();
					System.out.print("Enter number 2:");
					num2 = sc.nextFloat();
					result = num1 - num2;
					System.out.println("Substraction of " + num1 + " - " + num2 + " is " + result);
					System.out.println();
					break;
				case 3:
					System.out.println("Multiplication");
					System.out.print("Enter number 1:");
					num1 = sc.nextFloat();
					System.out.print("Enter number 2:");
					num2 = sc.nextFloat();
					result = num1 * num2;
					System.out.println("Multiplication of " + num1 + " * " + num2 + " is " + result);
					System.out.println();
					break;
				case 4:
					System.out.println("Division");
					System.out.print("Enter number 1:");
					num1 = sc.nextFloat();
					System.out.print("Enter number 2:");
					num2 = sc.nextFloat();
					if(num2 !=0) {
					result = num1 / num2;
					
					System.out.println("Division of " + num1 + " / " + num2 + " is " + result);
					System.out.println();
					}else {
						System.out.println("Cannot divide by zero");
						System.out.println();
					}
					break;
				default:
					System.out.println("Please Enter Valid Number!");
					break;
				}
			}
		}
	}
}
