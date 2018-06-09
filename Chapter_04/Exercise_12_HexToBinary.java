import java.util.Scanner;
/*
 * (Hex to binary) Write a program that prompts the user to enter a hex digit
 * and displays its corresponding binary number. Here is a sample run: 
 * Enter a hex digit: B
 * The binary value is 1011
 * Enter a hex digit: G
 * G is an invalid
 *
 */

public class Exercise_12_HexToBinary {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter a hex digit (a number between 0 and 9 or letter between A and F): ");
		String str = in.next().toUpperCase();
		
		in.close();
		
		if (str.length() != 1) {
			System.out.print("You must enter excatly one character!");
		}
		else {

		if (Character.isLetter(str.charAt(0))) {
			if (str.charAt(0) >= 'A' && str.charAt(0) <= 'F') {
				switch (str.charAt(0)) {

				case 'A':
					System.out.print("The binary value is 1010");
					break;
				case 'B':
					System.out.print("The binary value is 1011");
					break;
				case 'C':
					System.out.print("The binary value is 1100");
					break;
				case 'D':
					System.out.print("The binary value is 1101");
					break;
				case 'E':
					System.out.print("The binary value is 1110");
					break;
				case 'F':
					System.out.print("The binary value is 1111");
					break;
				}
				
			} else
				System.out.print("Wrong input!");
		}

		else if (Character.isDigit(str.charAt(0))) {
			char ch = str.charAt(0);
			if ((ch == '0') || (ch == '1') || (ch == '2') || (ch == '3') || (ch == '4') || (ch == '5') || (ch == '6')
					|| (ch == '7') || (ch == '8') || (ch == '9')) {

				switch (ch) {
				case '0':
					System.out.print("The binary value is " + ch);
					break;
				case '1':
					System.out.print("The binary value is " + ch);
					break;
				case '2':
					System.out.print("The binary value is 10");
					break;
				case '3':
					System.out.print("The binary value is 11");
					break;
				case '4':
					System.out.print("The binary value is 100");
					break;
				case '5':
					System.out.print("The binary value is 101");
					break;
				case '6':
					System.out.print("The binary value is 110");
					break;
				case '7':
					System.out.print("The binary value is 111");
					break;
				case '8':
					System.out.print("The binary value is 1000");
					break;
				case '9':
					System.out.print("The binary value is 1001");
					break;
				}
			} 

		}
	}

}
}
