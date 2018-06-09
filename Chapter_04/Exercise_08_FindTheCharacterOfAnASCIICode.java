import java.util.*;
/*
 * (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 *       Enter an ASCII code: 69
 *       The character for ASCII code 69 is E
 *
 */

public class Exercise_08_FindTheCharacterOfAnASCIICode {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter an ASCII code: ");

		int num = in.nextInt();

		System.out.print("The character for ASCII code " + num + " is " + (char) num);

		in.close();
	}

}
