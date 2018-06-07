import java.util.*;
/*
 * (Palindrome number) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome number. A number is palindrome
 * if it reads the same from right to left and from left to right. Here is a sample
 * run of this program:
 *             Enter a three-digit integer: 121
 *             121 is a palindrome
 *             Enter a three-digit integer: 123
 *             123 is not a palindrome       
 *
 */

public class Exercise_12_PalindromeNumber {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a three-digit integer: ");
		int num = in.nextInt();
		in.close();

		//to check if user has entered three-digit integer
		//length of three-digit integer is 2, four-digit integer is 3, five-digit integer is 4...
		int length = (int) Math.log10(num);
		
		if (length < 2 || length > 2) {
			System.out.print("Wrong input! You must enter three-digit number!");
		}
		
		else {
		int num1 = num / 100;
		int num3 = num % 10;

		if (num1 == num3) {
			System.out.print(num + " is a palindrome.");
		} else
			System.out.print(num + " is not a palindrome.");

		}
	}

}
