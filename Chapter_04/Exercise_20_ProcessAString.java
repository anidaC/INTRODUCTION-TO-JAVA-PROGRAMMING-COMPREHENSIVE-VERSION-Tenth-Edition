import java.util.*;
/*
 *  (Process a string) Write a program that prompts the user to enter a string and displays its
 *  length and its first character. 
 *
 */

public class Exercise_20_ProcessAString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = in.nextLine();

		in.close();

		System.out.println("The length of an entered string is: " + str.length());
		System.out.print("First character of an entered string is " + str.charAt(0));
	}

}
