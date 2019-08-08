package com.skilldistillery.cards.common;

public enum Suit {
	HEARTS("\u2665"), SPADES("\u2660"), CLUBS("\u2663"), DIAMONDS("\u2666");
	final private String name;
	
	Suit(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
	public String getName() {
		return name;
	}
	
}
