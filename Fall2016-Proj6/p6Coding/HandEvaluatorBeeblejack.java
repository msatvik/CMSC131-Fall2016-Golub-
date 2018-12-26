package p6Coding;

import java.util.ArrayList;

public class HandEvaluatorBeeblejack {
	// ALL OF THESE ARE PASSED AN ARRAYLIST<CARD> OF "UNKNOWN" LENGTH

	/* This method is used 
	 * to return an integer value
	 */
	public static int eval(ArrayList<Card> hand) {
		if (hand.size() == 2) {
			int a = hand.get(0).getValue();
			int b = hand.get(1).getValue();
			if ((a == 4 && b == 2) || (a == 2 && b == 4)) {
				return 22;
			} else if ((a == 9 && b == 6) || (a == 6 && b == 9)) {
				return 21;
			}
		}
		int sum = 0;
		for (int i = 0; i < hand.size(); i++) {
			sum += hand.get(i).getValue();
		}
		for (int i = 0; i < hand.size(); i++) {
			if (sum <= 11 && hand.get(i).getValue() == 5) {
				sum += 10;
			}
		}
		if (sum <= 21) {
			return sum;
		} else {
			return 0;
		}
	}

	/* This method is used 
	 * to return a boolean value(true or false)
	 */
	
	public static boolean houseWins(ArrayList<Card> player, ArrayList<Card> dealer) {
		int valueplayer = eval(player);
		int valuedealer = eval(dealer);
		if (valueplayer >= valuedealer) {
			return false;
		} else {
			return true;
		}
	}
}
