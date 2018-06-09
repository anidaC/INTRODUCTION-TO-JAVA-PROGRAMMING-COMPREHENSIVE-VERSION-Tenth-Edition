/*
 *  (Generate vehicle plate numbers) Assume a vehicle plate number consists of three uppercase
 *  letters followed by four digits. Write a program to generate a plate number. 
 *  LLL-DDDD
 *
 */

public class Exercise_25_GenerateVehiclePlateNumbers {

	public static void main(String[] args) {
		
		char letter1 = (char) (65 + Math.random() * 26);
		char letter2 = (char) (65 + Math.random() * 26);
		char letter3 = (char) (65 + Math.random() * 26);
		
		int num = (int) (1000 + Math.random() * 9000);
		
		System.out.print(letter1 + "" +letter2 + "" + letter3 + "-" + num );
	}

}
