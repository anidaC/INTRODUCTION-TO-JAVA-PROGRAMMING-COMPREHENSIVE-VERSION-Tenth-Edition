/*
 *  (Random character) Write a program that displays a random uppercase letter using the
 *  Math.random() method. 
 *
 */
public class Exercise_16_RandomCharacter {

	public static void main(String[] args) {
		
		int letter = (int) (65 + Math.random() * 26);
		
		System.out.print("Random letter: " + (char) letter);

	}

}
