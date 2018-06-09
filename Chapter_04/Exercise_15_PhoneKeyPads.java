import java.util.*;
/*
 *  (Phone key pads) The international standard letter/number mapping found on the telephone is
 *  shown below:
 *    1    2    3
 *        ABC  DEF
 *    4    5    6
 *   GHI  JKL  MNO
 *    7    8    9
 *   PQRS TUV  WXYZ
 * Write a program that prompts the user to enter a letter and displays its corresponding number. 
 *         Enter a letter: A
 *         The corresponding number is 2
 *         Enter a letter: a
 *         The corresponding number is 2
 *         Enter a letter: +
 *         + is an invalid input
 *
 */

public class Exercise_15_PhoneKeyPads {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char letter = in.next().toUpperCase().charAt(0);
		in.close();

		if ((letter == 'A') || (letter == 'B') || (letter == 'C')) {
			System.out.print("The corresponding number is 2");
		} else if ((letter == 'D') || (letter == 'E') || (letter == 'F')) {
			System.out.print("The corresponding number is 3");
		} else if ((letter == 'G') || (letter == 'H') || (letter == 'I')) {
			System.out.print("The corresponding number is 4");
		} else if ((letter == 'J') || (letter == 'K') || (letter == 'L')) {
			System.out.print("The corresponding number is 5");
		} else if ((letter == 'M') || (letter == 'N') || (letter == 'O')) {
			System.out.print("The corresponding number is 6");
		} else if ((letter == 'P') || (letter == 'Q') || (letter == 'R') || (letter == 'S')) {
			System.out.print("The corresponding number is 7");
		} else if ((letter == 'T') || (letter == 'U') || (letter == 'V')) {
			System.out.print("The corresponding number is 8");
		} else if ((letter == 'W') || (letter == 'X') || (letter == 'Y') || (letter == 'Z')) {
			System.out.print("The corresponding number is 9");
		} else {
			System.out.print(letter + " is an invalid input!");
		}

	}

}
