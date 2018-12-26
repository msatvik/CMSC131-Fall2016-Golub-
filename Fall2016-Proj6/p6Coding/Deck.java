package p6Coding;

import java.util.ArrayList;

public class Deck {

	// YOU NEED TO USE THIS ARRAYLIST<CARD> TO HOLD THE DECK
	// YOU CANNOT USE REGULAR ARRAYS IN THIS CLASS OTHER THAN
	// IN THE DEAL METHOD, WHICH NEEDS TO RETURN AN ARRAY

	private ArrayList<Card> cards;

	public Deck() {
		cards = new ArrayList<Card>();
		int value = 0;
		int counter = 0;
		while (value < 9 && counter < 5) {
			Card card = new Card(value + 1, counter);
			cards.add(card);
			value++;
			if (value == 9) {
				value = 0;
				counter++;
			}
		}
	}

	public Deck(Deck other) {
		cards = new ArrayList<Card>(other.cards);
	}

	public Card getCardAt(int position) {
		return cards.get(position);
	}

	public int getNumCards() {
		return cards.size();
	}

	public Card[] deal(int numCards) {
		Card[] deal;
		deal = new Card[numCards];
		int iterator = 0;
		while (iterator < numCards) {
			deal[iterator] = cards.get(0);
			cards.remove(0);
			iterator++;
			
		}
		return deal;
	}

	public void cut(int position) {
		int iterator = 0;
		while (iterator < position) {
			cards.add(cards.get(0));
			cards.remove(0);
			iterator++;
		}
	}

	/*This is a Challenge Method
	 * This method is used to shuffle the cards ( Challenge Problem )
	 */
	
	public void shuffle() {
		throw new RuntimeException("Challenge problem...");
		
	}

}
