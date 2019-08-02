package com.skilldistillery.cards.blackjack;

import com.skilldistillery.cards.common.Card;

public class BJPlayer implements PlayBJ{

	BlackjackHand playerHand = new BlackjackHand();
	Card card;
	
	public BJPlayer(){}
	
	public BlackjackHand getPlayerHand() {
		return playerHand;
	}
	
	public void setPlayerHand(BlackjackHand playerHand) {
		this.playerHand = playerHand;
	}
	
	public void checkHand(BlackjackHand playerHand) {}
	
	public void hitMe(BlackjackHand playerHand) {}
	
	public void startHand(BlackjackHand playerHand) {}

	
}
