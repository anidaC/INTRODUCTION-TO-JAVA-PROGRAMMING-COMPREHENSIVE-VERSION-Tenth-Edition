import java.util.*;
/*
 *  (Student major and status) Write a program that prompts the user to enter two characters and
 *  displays the major and status represented in the characters. The first character indicates
 *  the major and the second is number character 1, 2, 3, 4, which indicates whether a student is
 *  a freshman, sophomore, junior, or senior. Suppose the following chracters are used to denote
 *  the majors: M: Mathematics C: Computer Science I: Information Technology
 *                   Here is a sample run: 
 *                   Enter two characters: M1
 *                   Mathematics Freshman
 *                   Enter two characters: C3
 *                   Computer Science Junior
 *                   Enter two characters: T3
 *                   Invalid input
 *
 */

public class Exercise_18_StudensMajorAndStatus {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Enter two characters: ");
		String str = in.next().toUpperCase();

		in.close();

		if ((str.length() != 2) || (str.charAt(0) != 'M') && (str.charAt(0) != 'C') && (str.charAt(0) != 'I')
				|| (str.charAt(1) != '1') && (str.charAt(1) != '2') && (str.charAt(1) != '3')
						&& (str.charAt(1) != '4')) {
			System.out.print("Invalid input!");

		} else {

			switch(str.charAt(0)) {
			case 'M':
				System.out.print("Mathematics");
				break;
			case 'C':
				System.out.print("Computer Science");
				break;
			case 'I':
				System.out.print("Information Technology");
				break;
			}

			switch(str.charAt(1)) {
			case '1':
				System.out.print(" Freshman");
				break;
			case '2':
				System.out.print(" Sophomore");
			break;
			case '3':
				System.out.print(" Junior");
				break;
			case '4':
				System.out.print(" Senior");
				break;
			
			}
		}

	}
}
