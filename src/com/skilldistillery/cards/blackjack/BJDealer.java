package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.*;

public class BJDealer {

	Deck deck;
	
	BlackjackHand dealerHand = new BlackjackHand();
	
	public BJDealer() {
		deck = new Deck();
		deck.shuffle();
	}
	
	public void startDealer(BlackjackHand dealerHand) {
		dealerHand.clear();
		for (int i = 0; i <= 1; i++) {
			dealerHand.addCard(deck.dealCard());
		}
		System.out.println("Dealer's Hand");
		checkHand(dealerHand);
		System.out.println("\t[]");
	}
	
	public boolean startPlayerHand(BlackjackHand playerHand) {
		playerHand.clear();
		boolean play = true;
		for (int i = 0; i <= 1; i++) {
			playerHand.addCard(deck.dealCard());
		}
		System.out.println("Player's Hand");
		playerHand.showAllCards();
		int handValue = playerHand.getHandValue();
		System.out.println(handValue);
		if (handValue == 21) {
			play = false;
			System.out.println("Dealer has ");
		}
		return play;
	}
	
	public void checkHand(BlackjackHand dealerHand) {
		dealerHand.showCard();
	}
	
	public boolean	dealerTurn() {
		@SuppressWarnings("unused")
		int handValue = 0;
		boolean play = true;
		System.out.println("Dealer's Hand");
		dealerHand.showAllCards();
		int dealerHandValue = dealerHand.getHandValue();
		System.out.println(dealerHandValue);
		if (dealerHand.getHandValue() == 21) {
			System.out.println("Dealer has Blackjack.\n"
					+ "Dealer wins");
		} while (dealerHandValue < 17) {
			dealerHand.addCard(deck.dealCard());
			dealerHandValue = dealerHand.getHandValue();
			System.out.println("* * * * * * * * * *");
			System.out.println("Dealer takes a card");
			System.out.println("* * * * * * * * * *");
			dealerHand.showAllCards();
			System.out.println("Dealers hand value at "+dealerHandValue);
		}
		if (dealerHandValue > 21) {
			System.out.println("Dealer busts.");
		} else if (dealerHandValue == 21) {
			System.out.println("Dealer wins.");
		} else {
			System.out.println("Dealer holds.");
		}
		return play;
	}
	
	public boolean playerHit(BlackjackHand playerHand) {
		boolean play = true;
		playerHand.getHandValue();
		playerHand.addCard(deck.dealCard());
		System.out.println("Dealing player cards.");
		playerHand.showAllCards();
		playerHand.getHandValue();
		if (playerHand.getHandValue() > 21) {
			play = false;
			System.out.println("You bust out.");
			return play;
		} else if (playerHand.getHandValue() == 21) {
			play = false;
			System.out.println("Player has Blackjack.");
			return play;
		} else {
			play = true;
		}
		return play;
	}
	
	public BlackjackHand getDealerHand() {
		return dealerHand;
	}
	
	public void startHand(BlackjackHand playerHand) {}
	
}
