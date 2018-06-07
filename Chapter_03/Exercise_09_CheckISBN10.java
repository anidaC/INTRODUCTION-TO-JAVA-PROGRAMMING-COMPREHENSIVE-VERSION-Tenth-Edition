import java.util.*;
/*
 * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other nine digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 *          Enter the first 9 digits of an ISBN as integer: 013601267
 *          The ISBN-10 number is 0136012671
 *          Enter the first 9 digits of an ISBN as integer: 013031997
 *          The ISBN-10 number is 013031997X     
 *
 */

public class Exercise_09_CheckISBN10 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the first 9 digits of an ISBN as integer (enter or space between numbers): ");
		int d1 = in.nextInt();
		int d2 = in.nextInt();
		int d3 = in.nextInt();
		int d4 = in.nextInt();
		int d5 = in.nextInt();
		int d6 = in.nextInt();
		int d7 = in.nextInt();
		int d8 = in.nextInt();
		int d9 = in.nextInt();
		
		in.close();

		int sum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

		if (sum == 10) {
			System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "X");
		} else {
			System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7
					+ "" + d8 + "" + d9 + "" + sum);
		}

	}

}
