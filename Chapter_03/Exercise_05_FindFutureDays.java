import java.util.*;
/*
 * (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, …, and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display
 * the future day of the week. Here is a sample run:
 *              Enter today's day: 1
 *              Enter the number of days elapsed since today: 3
 *              Today is Monday and the future day is Thursday
 *              Enter today's day: 0
 *              Enter the number of days elapsed since today: 31
 *              Today is Sunday and the future day is Wednesday    
 *
 */

public class Exercise_05_FindFutureDays {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter today's day (Sunday is 0, Monday is 1, …, and Saturday is 6): ");
		int today = in.nextInt();
		
		System.out.print("Enter the number of days elapsed since today: ");
		int futureDay = in.nextInt();
		
		in.close();

		switch (today) {
		case 0:
			System.out.print("Today is Sunday and the future day is ");
			break;
		case 1:
			System.out.print("Today is Monday and the future day is ");
			break;
		case 2:
			System.out.print("Today is Tuesday and the future day is ");
			break;
		case 3:
			System.out.print("Today is Wednesday and the future day is ");
			break;
		case 4:
			System.out.print("Today is Thursday and the future day is ");
			break;
		case 5:
			System.out.print("Today is Friday and the future day is ");
			break;
		case 6:
			System.out.print("Today is Saturday and the future day is ");
			break;
		}

		if ((today + futureDay) % 7 == 0) {
			System.out.print("Sunday.");
		} else if ((today + futureDay) % 7 == 1) {
			System.out.print("Monday.");
		} else if ((today + futureDay) % 7 == 2) {
			System.out.print("Tuesday.");
		} else if ((today + futureDay) % 7 == 3) {
			System.out.print("Wednesday.");
		} else if ((today + futureDay) % 7 == 4) {
			System.out.print("Thursday.");
		} else if ((today + futureDay) % 7 == 5) {
			System.out.print("Friday.");
		} else if ((today + futureDay) % 7 == 6) {
			System.out.print("Saturday.");
		}

	}

}
