/*
 * (Population projection) The U.S. Census Bureau projects population based on the
 * following assumptions:
 * - One birth every 7 seconds
 * - One death every 13 seconds
 * - One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume the
 * current population is 312,032,486 and one year has 365 days. Hint: In Java, if two
 * integers perform division, the result is an integer. The fractional part is truncated. For
 * example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an accurate result with
 * the fractional part, one of the values involved in the division must be a number with a
 * decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 *
 */
public class Exercise_11_PopulationProjection {

	public static void main(String[] args) {
		
		
		
		int yearInSeconds = 365 * 24 * 60 * 60;
		double birth = yearInSeconds / 7.0;
		double death = yearInSeconds / 13.0;
		double immigrants = yearInSeconds / 45.0;
		
		
		int currentPopulation = 312032486;
	    double population = (birth - death + immigrants);
			
	    System.out.println("Current population:" + currentPopulation);
	    
		double firstYear = currentPopulation + population;
		System.out.println("1. year population " + (int) firstYear);
		
		double secondYear = firstYear + population;
		System.out.println("2. year population " + (int) secondYear);
		
		double thirdYear = secondYear + population;
		System.out.println("3. year population " + (int) thirdYear);
		
		double fourthYear = thirdYear + population;
		System.out.println("4. year population " + (int) fourthYear);
		
		double fifthYear = fourthYear + population; 
		System.out.println("5. year population " + (int) fifthYear);

		

	}

}
