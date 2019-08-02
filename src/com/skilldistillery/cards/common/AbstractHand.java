package com.skilldistillery.cards.common;

import java.util.*;

public abstract class AbstractHand {
		protected List<Card> cards;
		
		public AbstractHand() {
			cards = new ArrayList<>();
		}
		
		public void addCard(Card card) {
			 cards.add(card);
		}
		
		public void clear() {
			cards.clear();
		}
		
		public abstract int getHandValue();
		
		public String toString() {
			// TO DO LATER
			return cards.toString();
		}
}
