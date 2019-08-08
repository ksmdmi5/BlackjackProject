package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;
import com.skilldistillery.cards.common.Deck;

public class BJPlayer implements PlayBJ {

	Deck deck;
	BlackjackHand playerHand = new BlackjackHand();
	Card card;

	public BJPlayer() {
		deck = new Deck();
		deck.shuffle();
	}

	public BlackjackHand getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}

	public void checkHand(BlackjackHand playerHand) {
	}

	public boolean hitMe(BlackjackHand playerHand) {
		boolean play = true;
		playerHand.getHandValue();
		playerHand.addCard(deck.dealCard());
		System.out.println("Dealing player cards.");
		playerHand.showAllCards();
		playerHand.getHandValue();
		System.out.println("Player hand value: "+playerHand.getHandValue());
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

	public boolean startHand(BlackjackHand playerHand) {
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
			play = false;
			System.out.println("Dealer has ");
		}
		return play;
	}
}
