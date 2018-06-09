import java.util.*;
/*
 *  (Check substring) Write a program that prompts the user to enter two strings and reports
 *  whether the second string is a substring of the first string.
 *  Enter string s1: ABCD
 *  Enter string s2: BC
 *  BC is a substring of ABCD
 *  Enter string s1: ABCD
 *  Enter string s2: BDC
 *  BDC is not a substring of ABCD
 *
 */

public class Exercise_22_CheckSubstring {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter string s1: ");
		String s1 = in.next();

		System.out.print("Enter string s2: ");
		String s2 = in.next();

		in.close();

		if (s1.contains(s2)) {
			System.out.print(s2 + " is a substring of " + s1);
		} else {
			System.out.print(s2 + " is not a substring of " + s1);
		}

	}

}
