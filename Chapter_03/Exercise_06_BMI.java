import java.util.Scanner;
/*
 *  (Health application: BMI) Revise Listing 3.4, ComputeAndInterpretBMI.java, to let the user 
 *  enter weight, feet, and inches. For example, if a person is 5 feet and 10 inches, you will 
 *  enter 5 for feet and 10 for inches. Here is a sample run:
 *           Enter weight in pounds: 140 
 *           Enter feet: 5 
 *           Enter inches: 10 
 *           BMI is 20.087702275404553
 *           Normal
 *
 *    BMI                    Interpretation 
 *    BMI < 18.5             Underweight 
 *    18.5  <=  BMI  < 25.0   Normal 
 *    25.0  <=  BMI  < 30.0   Overweight 
 *    30.0  <=  BMI           Obese
 *  Note that one pound is 0.45359237 kilograms and one inch is 0.0254 meters.
 *
 */

public class Exercise_06_BMI {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double pounds = in.nextDouble();

		System.out.print("Enter feet: ");
		double feet = in.nextDouble();

		System.out.print("Enter inches: ");
		double inches = in.nextDouble();

		in.close();

		double weight = pounds * 0.45359237;

		double height = (inches + (feet * 12)) * 0.0254;

		double BMI = weight / (height * height);

		System.out.println("BMI is: " + BMI);

		if (BMI < 18.5) {
			System.out.print("Underweight.");
		} else if ((BMI >= 18.5) && (BMI < 25.0)) {
			System.out.print("Normal!");
		} else if ((BMI >= 25.0) && (BMI < 30.0)) {
			System.out.print("Normal!");
		} else if (BMI >= 30.0) {
			System.out.print("Overweight!");
		}
	}

}
