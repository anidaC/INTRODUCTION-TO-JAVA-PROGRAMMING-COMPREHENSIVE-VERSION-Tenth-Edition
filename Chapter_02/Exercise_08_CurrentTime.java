import java.util.*;
/*
 * Create  a program that displays the current time in GMT. Program prompts the user to enter
 * the time zone offset to GMT and displays the time in the specified time zone.
 * Here is a sample run:
 *            Enter the time zone offset to GMT: -5
 *            The current time is 4:50:34
 *
 */

public class Exercise_08_CurrentTime {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the time zone offset to GMT: ");
		int GMT = in.nextInt();

		long miliseconds = System.currentTimeMillis();
		long seconds = miliseconds / 1000;
		long hour = (seconds / 60 / 60 % 24) + GMT;
		long minute = seconds / 60 % 60;
		long currentSec = seconds % 60;

		System.out.print("The current time is: " + hour + ":" + minute + ":" + currentSec);

		in.close();
	}

}
