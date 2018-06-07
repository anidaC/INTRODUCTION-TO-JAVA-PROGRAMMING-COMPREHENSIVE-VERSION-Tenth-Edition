import java.util.Scanner;
/*
 *  (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a subtraction question.
 *  Revise the program to randomly generate an addition question with two integers less than 100. 
 *
 */

public class Exercise_10_AdditonQuiz {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		if (number1 < number2) {

			int temp = number1;
			number1 = number2;
			number2 = temp;
		}

		System.out.print("What is " + number1 + " - " + number2 + "? ");
		int answer = in.nextInt();

		if (number1 - number2 == answer)
			System.out.println("You are correct!");

		else {
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + " - " + number2 + " should be " + (number1 - number2));
		}

		in.close();

	}

}
