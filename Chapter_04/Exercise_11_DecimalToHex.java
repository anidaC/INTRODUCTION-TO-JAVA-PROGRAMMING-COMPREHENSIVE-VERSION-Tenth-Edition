import java.util.*;
/*
 * (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. Here are some sample runs:
 *             Enter a decimal value (0 to 15): 11
 *             The hex value is B
 *             Enter a decimal value (0 to 15): 5
 *             The hex value is 5  
 *             Enter a decimal value (0 to 15): 31
 *             31 is an invalid input    
 *
 */

public class Exercise_11_DecimalToHex {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);

		System.out.print("Enter a decimal value (0 to 15): ");
		int value = in.nextInt();
		in.close();

		if (value < 0 || value > 15) {
			System.out.print(value + " is an invalid input!");
		}

		else if (value >= 0 && value <= 9) {
			System.out.print("The hex value is " + value);
		}
		else if (value >= 10 && value <= 15) {
			switch (value) {
			case 10:
				System.out.print("The hex value is A");
				break;
			case 11:
				System.out.print("The hex value is B");
				break;
			case 12:
				System.out.print("The hex value is C");
				break;
			case 13:
				System.out.print("The hex value is D");
				break;
			case 14:
				System.out.print("The hex value is E");
				break;
			case 15:
				System.out.print("The hex value is F");
				break;
			}
		}

	}

}
