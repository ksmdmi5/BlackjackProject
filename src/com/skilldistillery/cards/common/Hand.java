package com.skilldistillery.cards.common;

import java.util.*;

public abstract class Hand {
		protected List<Card> cards;
		
		public Hand() {
			cards = new ArrayList<>();
		}
		
		public void addCard(Card card) {
			 cards.add(card);
		}
		
		public void setCards(List<Card> cards) {
			this.cards = cards;
		}

		public List<Card> getCards() {
			return cards;
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
