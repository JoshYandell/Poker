package com.fdmgroup;

import java.util.Set;

public class Community {
	private int pot;
	private Hand hand;
	private Set<User> players;
	
	
	public int getPot() {
		return pot;
	}
	public void setPot(int pot) {
		this.pot = pot;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	public Set<User> getPlayers() {
		return players;
	}
	public void setPlayers(Set<User> players) {
		this.players = players;
	}
	
	
}
