import java.util.*;
/*
 * (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 *               Enter a character: E
 *               The Unicode for the character E is 69
 *
 */

public class Exercise_09_FindTheUnicodeOfACharacter {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = in.nextLine().charAt(0);

		System.out.print("The Unicode for the character " + ch + " is " + (int) ch);

		in.close();
	}

}
