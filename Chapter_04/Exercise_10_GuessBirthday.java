import java.util.*;
/*
 * (Guess birthday) Rewrite Listing 4.3, GuessBirthday.java, to prompt the user to
 * enter the character Y for Yes and N for No rather than entering 1 for Yes and 0
 * for No.
 *
 */

public class Exercise_10_GuessBirthday {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String set1 = " 1  2  3  7" + "\n 9 11 13 15" + "\n17 19 21 23" + "\n25 27 29 31";

		String set2 = " 2  3  6  7" + "\n10 11 14 15" + "\n18 19 22 23" + "\n26 27 30 31";

		String set3 = " 4  5  6  7" + "\n12 13 14 15" + "\n20 21 22 23" + "\n28 29 30 31";

		String set4 = " 8  9 10 11" + "\n12 13 14 15" + "\n24 25 26 27" + "\n28 29 30 31";

		String set5 = "16 17 18 19" + "\n20 21 22 23" + "\n24 25 26 27" + "\n28 29 30 31";

		System.out.println("Is your birthday in set1? ");
		System.out.println(set1);
		System.out.print("Enter Y for yes and N for no: ");
		char ch = in.nextLine().toUpperCase().charAt(0);

		int count = 0;

		if (ch == 'Y')
			count += 1;
		System.out.println("Is your birthday in set2?");
		System.out.println(set2);
		System.out.print("Enter Y for yes and N for no: ");
		ch = in.nextLine().toUpperCase().charAt(0);

		if (ch == 'Y')
			count += 2;

		System.out.println("Is your birthday in set3?");
		System.out.println(set3);
		System.out.print("Enter Y for yes and N for no: ");
		ch = in.nextLine().toUpperCase().charAt(0);

		if (ch == 'Y')
			count += 4;

		System.out.println("Is your birthday in set4?");
		System.out.println(set4);
		System.out.print("Enter Y for yes and N for no: ");
		ch = in.nextLine().toUpperCase().charAt(0);

		if (ch == 'Y')
			count += 8;

		System.out.println("Is your birthday in set5?");
		System.out.println(set5);
		System.out.print("Enter Y for yes and N for no: ");
		ch = in.nextLine().toUpperCase().charAt(0);

		if (ch == 'Y')
			count += 16;

		in.close();

		System.out.print("Your birthday is " + count);
	}

}
