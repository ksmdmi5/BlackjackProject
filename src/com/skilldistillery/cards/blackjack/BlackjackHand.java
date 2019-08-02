package com.skilldistillery.cards.blackjack;

import java.util.*;
import com.skilldistillery.cards.common.*;

public class BlackjackHand extends Hand {
	
	int handValue;
	
	public BlackjackHand() {}
	
	
	public boolean isBlackJack() {
		return true;
	}
	
	public boolean isBust() {
		return true;
	}

	@Override
	public int getHandValue() {
		handValue = 0;
		for (Card card : getCards()) {
			handValue += card.getValue();
		}
		return handValue;
	}
	
	public void showCard() {
		String showCard = getCards().get(1).toString();
		System.out.println(showCard);
	}
	
	public void showAllCards() {
		int length = getCards().size();
		for (int i = 0; i < length; i++) {
			String showCard = getCards().get(i).toString();
			System.out.println(showCard);
		}
	}
	
	public void setHandValue(int handValue) {
		this.handValue = handValue;
	}

	@Override
	public void addCard(Card card) {
		super.addCard(card);
	}

	@Override
	public void clear() {
		super.clear();
	}

	@Override
	public String toString() {
		return super.toString();
	}
	

}
