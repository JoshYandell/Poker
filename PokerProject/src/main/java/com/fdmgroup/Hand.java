package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;

public class Hand {

	private List<Card> hand = new ArrayList<>();
	private int maxValue = 0;
	
	public void addToHand(Card...cards) {
		for(Card card : cards) {
			hand.add(card);
		}
	}
	
	public void reset() {
		for(Card card : hand) {
			hand.remove(card);
		}
	}

	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getMaxValue() {
		return maxValue;
	}

	public void setMaxValue(int maxValue) {
		this.maxValue = maxValue;
	}
	
}