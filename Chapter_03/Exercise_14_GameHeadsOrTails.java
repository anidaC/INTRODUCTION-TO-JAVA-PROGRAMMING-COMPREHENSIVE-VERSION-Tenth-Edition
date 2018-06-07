import java.util.*;
/*
 * (Game: heads or tails) Write a program that lets the user guess whether the flip of
 * a coin results in heads or tails. The program randomly generates an integer 0 or 1,
 * which represents head or tail. The program prompts the user to enter a guess and
 * reports whether the guess is correct or incorrect.
 *
 */

public class Exercise_14_GameHeadsOrTails {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int coin = (int) (Math.random() * 2);

		System.out.print(
				"Guess whether the flip of a coin results in heads or tails (enter integer 0 for head and 1 for tails): ");
		int guess = in.nextInt();

		in.close();

		if (coin == guess) {
			System.out.print("Your guess is correct!");
		} else {
			System.out.print("Your guess is incorrect! It is ");
			switch (coin) {

			case 0:
				System.out.print("heads.");
				break;
			case 1:
				System.out.print("tails.");

			}
		}

	}

}
