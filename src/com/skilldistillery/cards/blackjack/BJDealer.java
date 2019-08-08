package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.*;

public class BJDealer implements PlayBJ {

	Deck deck;

	BlackjackHand dealerHand = new BlackjackHand();

	public BJDealer() {
		deck = new Deck();
		deck.shuffle();
	}

	public void startDealer(BlackjackHand dealerHand) {
		dealerHand.clearHand();
		for (int i = 0; i <= 1; i++) {
			dealerHand.addCard(deck.dealCard());
		}
		System.out.println("Dealer's Hand");
		checkHand(dealerHand);
		System.out.println("\t[]");
	}

	public void checkHand(BlackjackHand dealerHand) {
		dealerHand.showCard();
	}

	public boolean dealerTurn() {
		@SuppressWarnings("unused")
		int handValue = 0;
		boolean play = true;
		System.out.println("Dealer's Hand");
		dealerHand.showAllCards();
		int dealerHandValue = dealerHand.getHandValue();
		System.out.println(dealerHandValue);
		if (dealerHand.getHandValue() == 21) {
			System.out.println("Dealer has Blackjack.\n" + "Dealer wins");
		}
		while (dealerHandValue < 17) {
			dealerHand.addCard(deck.dealCard());
			dealerHandValue = dealerHand.getHandValue();
			System.out.println("* * * * * * * * * *");
			System.out.println("Dealer takes a card");
			System.out.println("* * * * * * * * * *");
			dealerHand.showAllCards();
			System.out.println("Dealers hand value at " + dealerHandValue);

			if (dealerHandValue > 21) {
				System.out.println("Dealer busts.");
			} 
//			else if (dealerHandValue == 21) {
//				System.out.println("Dealer wins.");
//			} 
	// Testing screw up
			else {
				System.out.println("Dealer holds.");
			}
		}
		return play;
	}

	public BlackjackHand getDealerHand() {
		return dealerHand;
	}

	@Override
	public boolean startHand(BlackjackHand playerhand) {
		return false;
	}

	
}
