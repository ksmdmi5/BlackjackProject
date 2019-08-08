package com.skilldistillery.cards.blackjack;

import java.util.*;

import com.skilldistillery.cards.common.Deck;

public class BJApp {

	Scanner kb = new Scanner(System.in);
	BJDealer dealer = new BJDealer();
	BJPlayer player = new BJPlayer();
	boolean play = true;

	public BJApp() {
	}

	public void run() {

		intro();

		do {
			System.out.println("* * * * * *");
			System.out.println(" New Game");
			System.out.println("* * * * * *");
			dealer.startDealer(dealer.getDealerHand());
			player.startHand(player.getPlayerHand());
		} while (menu(play));
	}

	public boolean intro() {
		System.out.println("Welcom to BlackJack\n");
		System.out.println("Each turn you and the Dealer will be dealt 2 cards.\n"
				+ "The dealer will have one card face up and the other face down.\n"
				+ "Your goal is to get as close to 21 without going (Bust) over\n"
				+ "and getting a higher combined score than the Dealer. If you wish\n"
				+ "you can say \"Hit me\" to get another card or \"Hold\" to keep\n"
				+ "stay where you're at. Numbers are worth printed value, face cards\n"
				+ "(J,Q,K) are worth 10, and Ace is 11.");
		System.out.println("Are you ready (Y/N)?");
		String next = kb.next();
		if (next.equalsIgnoreCase("Y")) {
			play = true;
		} else if (next.equalsIgnoreCase("N")) {
			play = false;
			kb.close();
		} else if (!next.equalsIgnoreCase("Y") || (!next.equalsIgnoreCase("n"))) {
			System.out.println("Invalid try again.");
			intro();
		}
		return play;
	}


	public boolean menu(boolean play) {
		int choice = 1;
		while (play) {
			while (player.playerHand.getHandValue() < 21) {
				System.out.println("What would you like to do now?");
				System.out.println("1: Hit");
				System.out.println("2: Hold");
				System.out.print("Enter your choice: ");
				choice = kb.nextInt();
				if (choice == 1) {
					play = player.hitMe(player.getPlayerHand());
				} else {
					play = false;
					break;
				}
			}
			dealer.dealerTurn();

			compareHands();
			System.out.println("Play again (Y/N)?");

			String cont = kb.next();
			try {
				if (cont.equalsIgnoreCase("Y")) {
					return true;
				} else if (cont.equalsIgnoreCase("n")) {
					System.out.println("Leaving table.");
					kb.close();
					return false;
				}
			} catch (InputMismatchException e) {
				System.out.println("Y or N.");
				break;
			}
		}
		return false;
	}

	private void compareHands() {
		if ((dealer.dealerHand.getHandValue() > player.playerHand.getHandValue())
				&& (dealer.dealerHand.getHandValue() < 21)) {
			System.out.println("Dealer wins");
		} else if ((dealer.dealerHand.getHandValue() == 21) && (player.playerHand.getHandValue() == 21)) {
			System.out.println("Tie");
		} else if (dealer.dealerHand.getHandValue() == player.playerHand.getHandValue()) {
			System.out.println("Tie");
		} else if ((dealer.dealerHand.getHandValue() > 21) && (player.playerHand.getHandValue() > 21)) {
			System.out.println("Tie");
		} else if ((dealer.dealerHand.getHandValue() == 21) && (player.playerHand.getHandValue() == 21)) {
			System.out.println("Tie");
		} else if (player.playerHand.getHandValue() > 21) {
			System.out.println("Dealer wins");
		} else {
			System.out.println("Player wins.");
		}
	}

}
