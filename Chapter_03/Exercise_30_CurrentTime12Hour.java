import java.util.*;
/*
 * (Current time) Revise Programming Exercise 2.8 to display the hour using a
 * 12-hour clock. Here is a sample run:
 *                    Enter the time zone offset to GMT: -5
 *                    The current time is 4:50:34 AM
 *
 */

public class Exercise_30_CurrentTime12Hour {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the time zone offset to GMT: ");
		int GMT = in.nextInt();
		
		in.close();

		long miliseconds = System.currentTimeMillis();
		long seconds = miliseconds / 1000;
		long hour = (seconds / 60 / 60 % 24) + GMT;
		long minute = seconds / 60 % 60;
		long second = seconds % 60;

		if (hour > 12) {
			System.out.println("The current time is " + (hour - 12) + ":" + minute + ":" + second);
		} else {
			System.out.println("The current time is " + hour + ":" + minute + ":" + second);
		}
	}

}
