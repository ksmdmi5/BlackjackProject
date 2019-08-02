package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.*;

public class BJDealer {

	Deck deck;
	
	BlackjackHand dealerHand = new BlackjackHand();
	
	public Dealer() {
		deck = new Deck();
		deck.shuffleDeck();
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
	
	public boolean startPlayerHand(BlackjackHand playerHand) {
		playerHand.clearHand();
		boolean play = true;
		for (int i = 0; i <= 1; i++) {
			playerHand.addCard(deck.dealCard());
		}
		System.out.println("Player's Hand");
		playerHand.showAllCards();
		int handValue = playerHand.getHandValue();
		System.out.println(handValue);
		if (handValue == 21) {
			player = false;
			System.out.println("Dealer has");
			return play;
		}
	}
	
//	@Override
	public void checkHand(BlackjackHand dealerHand) {
		dealerHand.showCard();
	}
	
	public boolean	dealerTurn() {
		int handValue = 0;
		boolean play = true;
		System.out.println("Dealer's Hand");
		dealerHand.showAllCards();
		int dealerHandValue = dealerHand.getHandValue();
		System.out.println(dealerHandValue);
		if (dealerHand.getHandValue() == 21) {
			System.out.println("Dealer has blackjack.\n"
					+ "Dealer wins");
		} while (dealerHandValue < 17) {
			dealerHand.addCard(deck.dealCard());
			dealerHandValue = dealerHand.getHandValue();
			System.out.println("* * * * * * * * * *");
			System.out.println("Dealer takes a card");
			System.out.println("* * * * * * * * * *");
			dealerHand.showAllCards();
		}
		if (dealerHandValue > 21) {
			System.out.println("Dealer busts.");
		} else if (dealerHandValue == 21) {
			
		}
	}
	
	public boolean playerHit(BlackjackHand playerHand) {
		
	}
	
}
