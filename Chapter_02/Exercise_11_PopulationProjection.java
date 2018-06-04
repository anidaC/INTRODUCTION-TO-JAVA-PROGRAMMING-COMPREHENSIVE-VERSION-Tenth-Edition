import java.util.Scanner;
/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and displays the population after the number of
 * years. Use the hint in Programming Exercise 1.11 for this program. The
 * population should be cast into an integer. 
 * Here is a sample run of the program: 
 * Enter the number of years: 5 
 * The population in 5 years is 325932970
 *
 */

public class Exercise_11_PopulationProjection {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int yearInSeconds = 365 * 24 * 60 * 60;
		double birth = yearInSeconds / 7.0;
		double death = yearInSeconds / 13.0;
		double immigrants = yearInSeconds / 45.0;

		double population = (birth - death + immigrants);
		
		int currentPopulation = 312032486;

		System.out.print("Enter the number of years: ");
		int n = in.nextInt();

		double populationInYear = currentPopulation + population * n;
		
		System.out.println("The population in " + n + " years is: " + Math.round(populationInYear)); 
		
		in.close();
	}

}
