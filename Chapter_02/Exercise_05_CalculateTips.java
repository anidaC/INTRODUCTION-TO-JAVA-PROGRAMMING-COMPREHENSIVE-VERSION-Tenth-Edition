import java.util.*;
/*
 * (Financial application: calculate tips) Write a program that reads the subtotal
 * and the gratuity rate, then computes the gratuity and total. For example, if the
 * user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
 * as gratuity and $11.5 as total. Here is a sample run:
 *                Enter the subtotal and a gratuity rate: 10 15
 *                The gratuity is $1.5 and total is $11.5
 *
 */

public class Exercise_05_CalculateTips {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the subtotal: ");
		double subtotal = in.nextDouble();
		System.out.print("Enter a gratuity rate (in percentage): ");
		double gratuityRate = in.nextDouble();

		double rate = (gratuityRate / 100) * subtotal;
		double total = subtotal + rate;

		System.out.print("The gratuity is $" + rate + " and total is $" + total);

		in.close();
	}

}
