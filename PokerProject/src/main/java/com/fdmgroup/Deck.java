package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck {
	
	private static Deck s_deck=new Deck();
	
	private CardFactory cardFactory = new CardFactory();
	private List<Card> deck = new ArrayList<>();
	
	public static Deck getDeck() {
		return s_deck;
	}
	
	public Card popCard() {
		return deck.remove(0);
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public void init() {
		if(!deck.isEmpty()) deck.removeAll(deck);
		for(Suit s : Suit.values()) {
			for(int i=1; i<14; i++) {
				deck.add(cardFactory.createCard(i, s));
			}
		}
	}
}