import java.util.*;
/*
 * (Use the &&, || and ^ operators) Write a program that prompts the user to enter
 * an integer and determines whether it is divisible by 5 and 6, whether it is divisible
 * by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run
 * of this program:
 *               Enter an integer: 10
 *               Is 10 divisible by 5 and 6? false
 *               Is 10 divisible by 5 or 6? true
 *               Is 10 divisible by 5 or 6, but not both? true
 *
 */

public class Exercise_26_UseOperators {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Enter an integer: ");
		int number = in.nextInt();
		in.close();

		if ((number % 5 == 0) && (number % 6 == 0)) {
			System.out.println("Is 10 divisible by 5 and 6? true");
		} else {
			System.out.println("Is 10 divisible by 5 and 6? false");
		}
		if ((number % 5 == 0) || (number % 6 == 0)) {
			System.out.println("Is 10 divisible by 5 or 6? true");
		} else {
			System.out.println("Is 10 divisible by 5 and 6? false");
		}
		if ((number % 5 == 0) ^ (number % 6 == 0)) {
			System.out.println("Is 10 divisible by 5 or 6, but not both? true");
		} else {
			System.out.println("Is 10 divisible by 5 or 6? false");
		}

	}

}
