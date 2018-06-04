import java.util.*;
/*
 * (Sum the digits in an integer) Write a program that reads an integer between
 * 0 and 1000 and adds all the digits in the integer. For example, if an integer
 * is 932, the sum of all its digits is 14. 
 * Hint: Use the % operator to extract digits, and use the / operator to remove the extracted digit. 
 * For instance, 932 % 10 = 2 and 932 / 10 = 93. 
 * Here is a sample run:     Enter a number between 0 and 1000: 999 
 *                           The sum of the digits is 27 
 *
 */

public class Exercise_06_SumTheDigitsInAnInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number between 0 and 1000: ");
		int number = in.nextInt();
		in.close();

		int num1 = number / 100;
		int num2 = number / 10 % 10;
		int num3 = number % 10;

		int sum = num1 + num2 + num3;

		System.out.print("The sum of the digits is: " + sum);

	}

}
