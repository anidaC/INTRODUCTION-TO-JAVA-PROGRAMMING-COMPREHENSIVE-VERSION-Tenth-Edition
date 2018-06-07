import java.util.*;
/*
 * (Game: scissor, rock, paper) Write a program that plays the popular
 * scissor-rockpaper game. (A scissor can cut a paper, a rock can knock a
 * scissor, and a paper can wrap a rock.) The program randomly generates a
 * number 0, 1, or 2 representing scissor, rock, and paper. The program prompts
 * the user to enter a number 0, 1, or 2 and displays a message indicating
 * whether the user or the computer wins, loses, or draws. Here are sample runs:
 * scissor (0), rock (1), paper (2): 1 
 * The computer is scissor. You are rock. You won 
 * scissor (0), rock (1), paper (2): 2 
 * The computer is paper. You are paper too. It is a draw
 *
 */

public class Exercise_17_GameScissorRockPaper {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter the number (scissor(0), rock (1), paper (2)): ");
		int user = in.nextInt();

		in.close();

		if (user < 0 || user > 3) {
			System.out.print("Wrong input!");
		} else {

			switch (user) {
			case 0:
				System.out.print("You are scissor.");
				break;
			case 1:
				System.out.print("You are rock.");
				break;
			case 2:
				System.out.print("You are paper.");
				break;
			}

			int computer = (int) (Math.random() * 3);

			switch (computer) {
			case 0:
				System.out.print(" The computer is scissor.");
				break;
			case 1:
				System.out.print(" The computer is rock.");
				break;
			case 2:
				System.out.print(" The computer is paper.");
			}

			if (computer == user) {
				System.out.print(" It is a draw!");
			} else if ((computer == 0) && (user == 1)) {
				System.out.print(" You won!");
			} else if ((computer == 0) && (user == 2)) {
				System.out.print(" Computer won!");
			} else if ((computer == 1) && (user == 0)) {
				System.out.print(" Computer won!");
			} else if ((computer == 1) && (user == 2)) {
				System.out.print(" You won!");
			} else if ((computer == 2) && (user == 0)) {
				System.out.print(" You won!");
			} else {
				System.out.print(" Computer won!");
			}

		}
	}

}
