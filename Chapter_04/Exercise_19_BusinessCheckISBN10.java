import java.util.Scanner;
/*
 *  (Business: check ISBN-10) Rewrite the Programming Exercise 3.9 by entering the ISBN 
 *  number as a string. 
 *
 */

public class Exercise_19_BusinessCheckISBN10 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the first 9 digits of an ISBN as a string: ");
		String ISBN = in.next();

		in.close();

		if ((ISBN.length() == 9) && (Character.isDigit(ISBN.charAt(0))) && (Character.isDigit(ISBN.charAt(1)))
				&& (Character.isDigit(ISBN.charAt(2))) && (Character.isDigit(ISBN.charAt(3)))
				&& (Character.isDigit(ISBN.charAt(4))) && (Character.isDigit(ISBN.charAt(5)))
				&& (Character.isDigit(ISBN.charAt(6))) && (Character.isDigit(ISBN.charAt(7)))
				&& (Character.isDigit(ISBN.charAt(8)))) {

			int d1 = Character.getNumericValue(ISBN.charAt(0));
			int d2 = Character.getNumericValue(ISBN.charAt(1));
			int d3 = Character.getNumericValue(ISBN.charAt(2));
			int d4 = Character.getNumericValue(ISBN.charAt(3));
			int d5 = Character.getNumericValue(ISBN.charAt(4));
			int d6 = Character.getNumericValue(ISBN.charAt(5));
			int d7 = Character.getNumericValue(ISBN.charAt(6));
			int d8 = Character.getNumericValue(ISBN.charAt(7));
			int d9 = Character.getNumericValue(ISBN.charAt(8));

			int sum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

			if (sum == 10) {
				System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
						+ d7 + "" + d8 + "" + d9 + "X");
			} else {
				System.out.print("The ISBN-10 number is " + d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + ""
						+ d7 + "" + d8 + "" + d9 + "" + sum);
			}
		}

		else
			System.out.print("Invalid input!");

	}
}
