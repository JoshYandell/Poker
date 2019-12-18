package com.fdmgroup;

public class CardFactory {

	public Card createCard(int value, Suit suit) {
		Card card = new Card();
		card.setValue(value);
		card.setSuit(suit);
		return card;
	}
}
