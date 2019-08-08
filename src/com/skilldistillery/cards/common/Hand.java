package com.skilldistillery.cards.common;

import java.util.*;

public abstract class Hand {
	protected List<Card> hand = new ArrayList<>();;

	public Hand() {
	}

	public int getHandValue() {
		return 0;
	}

	public void addCard(Card card) {
		getHand().add(card);
	}

	public void clearHand() {
		getHand().clear();
	}

	public List<Card> getCards() {
		return getHand();
	}

	public String toString() {
		StringBuilder handString = new StringBuilder();
		for (Card card : getHand()) {
			handString.append(card.toString());
		}
		return handString.toString();
	}

	public List<Card> getHand() {
		return hand;
	}
}
