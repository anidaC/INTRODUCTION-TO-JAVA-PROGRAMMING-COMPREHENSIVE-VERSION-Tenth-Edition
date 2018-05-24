/*
 * (Average speed in miles) Assume a runner runs 14 kilometers in 45 minutes and 30
 * seconds. Write a program that displays the average speed in miles per hour. (Note
 * that 1 mile is 1.6 kilometers.)
 *
 */
public class Exercise_10_AverageSpeedInMiles {

	public static void main(String[] args) {
		
		double kilometers = 14;
		double miles = kilometers / 1.6;
		double speedInSeconds = 2730;
		double average = miles / speedInSeconds;
		double averagePerHour = average * 60 * 60;
		
		System.out.println("Runner runs " +  averagePerHour + " miles per hour.");
		//or
		System.out.print("Runner runs approximately " +  (int) averagePerHour + " miles per hour.");

	}

}
