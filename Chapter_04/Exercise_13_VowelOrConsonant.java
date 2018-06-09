import java.util.*;
/*
 * (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. Here is a sample run:
 *           Enter a letter: B
 *           B is a consonant
 *           Enter a letter grade: a
 *           a is a vowel   
 *           Enter a letter grade: #
 *           # is an invalid input     
 *
 */

public class Exercise_13_VowelOrConsonant {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a letter: ");
		char ch = in.next().charAt(0);

		if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') || (ch == 'A') || (ch == 'E')
				|| (ch == 'I') || (ch == 'O') || (ch == 'U')) {
			System.out.print(ch + " is a vowel.");
		} else if (((ch >= 'b' && ch <= 'z') || (ch >= 'B' && ch <= 'Z') && (ch != 'a' || ch != 'e' || ch != 'i'
				|| ch != 'o' || ch != 'u' || ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U'))) {
			System.out.print(ch + " is a consonant.");
		} else {
			System.out.print(ch + " is an invalid input.");
		}

		in.close();

	}

}
