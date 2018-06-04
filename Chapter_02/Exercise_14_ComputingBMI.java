import java.util.Scanner;
/*
 *  (Health application: computing BMI) Body Mass Index (BMI) is a measure of health on weight. 
 *  It can be calculated by taking your weight in kilograms and dividing by the square of your 
 *  height in meters. Write a program that prompts the user to enter a weight in pounds and 
 *  height in inches and displays the BMI. Note that one pound is 0.45359237 kilograms and one 
 *  inch is 0.0254 meters. 
 *  Here is a sample run:
 *        Enter weight in pounds: 95.5 
 *        Enter height in inches: 50 
 *        BMI is 26.8573 
 *
 */

public class Exercise_14_ComputingBMI {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter weight in pounds: ");
		double weightPounds = in.nextDouble();

		System.out.print("Enter height in inches: ");
		double heightInches = in.nextDouble();

		double weightKG = weightPounds * 0.45359237;
		double heightM = heightInches * 0.0254;

		double BMI = weightKG / (Math.pow(heightM, 2));

		System.out.print("BMI is " + (int) (BMI * 10000) / 10000.0);

		in.close();
	}

}
