/*
 * (Average speed in kilometers) Assume a runner runs 24 miles in 1 hour, 40 minutes,
 * and 35 seconds. Write a program that displays the average speed in kilometers per
 * hour. (Note that 1 mile is 1.6 kilometers.)
 *
 */
public class Exercise_12_AverageSpeedInKilometers {

	public static void main(String[] args) {
		
		double miles = 24;
		double timeSeconds = 6035;
		double km = miles * 1.6;
		double average = km / timeSeconds;
		double averageHour = average * 60 * 60;
		
		System.out.println("Runner runs " + averageHour + " kilometers per hour.");
		//or
		System.out.print("Runner runs approximately " +  (int) averageHour + " kilometers per hour.");
		
				 

	}

}
