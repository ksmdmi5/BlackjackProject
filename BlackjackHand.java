package com.skilldistillery.cards.blackjack;

import java.util.*;
import com.skilldistillery.cards.common.Hand;
import com.skilldistillery.cards.common.Card;

public class BlackjackHand extends Hand {
	
	int handValue;
	
	public BlackjackHand() {}

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

	

}
