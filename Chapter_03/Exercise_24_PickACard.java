/*
 * (Game: pick a card) Write a program that simulates picking a card from a deck
 * of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
 * Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card.
 * Here is a sample run of the program:
 *             The card you picked is Jack of Hearts
 *
 */

public class Exercise_24_PickACard {

	public static void main(String[] args) {
		
		int rank = (int) (1 + Math.random() * 13);
		int suit = (int) (Math.random() * 4);
		
		switch (rank) {
		case 1:
			System.out.print("The card you picked is Ace of ");
			break;
		case 11:
			System.out.print("The card you picked is Jack of ");
			break;
		case 12:
			System.out.print("The card you picked is Queen of ");
			break;
		case 13:
			System.out.print("The card you picked is King of ");
			break;
			default:
				System.out.print("The card you picked is " + rank + " of ");
		}
		
		switch (suit) {
		case 0:
			System.out.print("Clubs");
			break;
		case 1:
			System.out.print("Diamonds");
			break;
		case 2:
			System.out.print("Hearts");
			break;
		case 3:
			System.out.print("Spades");
			break;
		}



	}

}
