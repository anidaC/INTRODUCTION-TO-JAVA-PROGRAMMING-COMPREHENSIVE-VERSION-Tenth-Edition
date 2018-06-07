import java.util.*;
/*
 * (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 * 
 *
 */

public class Exercise_02_AddThreeNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int num1 = (int) (1 + Math.random() * 9);
		int num2 = (int) (1 + Math.random() * 9);
		int num3 = (int) (1 + Math.random() * 9);

		System.out.print(num1 + " + " + num2 + " + " + num3 + " = ");
		int answer = in.nextInt();

		in.close();

		int sum = num1 + num2 + num3;

		if (sum == answer) {
			System.out.print("Well done! " + num1 + " + " + num2 + " + " + num3 + " = " + sum);
		} else
			System.out.println("That is not correct! " + num1 + " + " + num2 + " + " + num3 + " = " + sum);
	}

}
